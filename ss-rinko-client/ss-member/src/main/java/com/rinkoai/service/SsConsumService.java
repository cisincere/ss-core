package com.rinkoai.service;

import com.rinkoai.common.util.R;
import com.rinkoai.fallback.SsConsumServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ss-provder", fallbackFactory = SsConsumServiceFallback.class)
public interface SsConsumService {
    @RequestMapping("/ss/test")
    R getName(@RequestParam("name") String name);
}
