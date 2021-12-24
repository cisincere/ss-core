package com.rinkoai.ss.gateway.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class AuthGatewayFilter implements GlobalFilter, Ordered {

    @Value("#{'${uri.ignore}'.split(',')}")
    public List<String> ignoreUrl;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url = exchange.getRequest().getURI().getPath();
        if (!ignoreUrl.contains(url)) {
            List<String> result = exchange.getRequest().getHeaders().get("ss-token");
            if (Objects.isNull(result) || result.size() <= 0) {
                ServerHttpResponse response = exchange.getResponse();
                Map<Object, Object> map = Maps.newHashMap();
                map.put("code", 401);
                map.put("message", "非法请求！");
                map.put("cause", "Token not is null");
                ObjectMapper mapper = new ObjectMapper();
                try {
                    byte[] bytes = mapper.writeValueAsBytes(map);
                    // 输出错误信息到页面
                    DataBuffer buffer = response.bufferFactory().wrap(bytes);
                    response.setStatusCode(HttpStatus.UNAUTHORIZED);
                    response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
                    return response.writeWith(Mono.just(buffer));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
