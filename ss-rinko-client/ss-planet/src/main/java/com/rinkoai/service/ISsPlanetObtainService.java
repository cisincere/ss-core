package com.rinkoai.service;

import com.rinkoai.common.util.R;
import com.rinkoai.fallback.ISsPlanetObtainServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "ss-minor-planet-provder", fallbackFactory = ISsPlanetObtainServiceFallback.class)
public interface ISsPlanetObtainService {
    @GetMapping("/planet/{number}")
    R getPlanetByNumber(@PathVariable("number")String number);
}
