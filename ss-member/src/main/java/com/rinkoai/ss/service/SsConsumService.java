package com.rinkoai.ss.service;

import com.rinkoai.ss.config.SentinelExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ss-provder", fallback = SentinelExceptionHandler.class)
public interface SsConsumService {
    @RequestMapping("/ss/test")
    public String getName(@RequestParam("name") String name);
}
