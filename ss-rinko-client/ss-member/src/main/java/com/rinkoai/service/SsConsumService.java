package com.rinkoai.service;

import com.rinkoai.common.util.R;
import com.rinkoai.fallback.SsConsumServiceFallback;
import com.rinkoai.ss.param.LoginParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "ss-manager-provder", fallbackFactory = SsConsumServiceFallback.class)
public interface SsConsumService {
    @PostMapping("/login")
    R getName(@RequestBody LoginParam user);
}
