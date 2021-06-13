package com.rinkoai.ss.gateway;

import com.fasterxml.jackson.core.filter.TokenFilter;
import com.rinkoai.ss.gateway.filter.AuthGatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
public class SsGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsGatewayApplication.class, args);
    }

}
