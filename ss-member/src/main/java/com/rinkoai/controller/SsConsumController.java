package com.rinkoai.controller;

import com.rinkoai.common.util.R;
import com.rinkoai.service.SsConsumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss")
public class SsConsumController {
    @Autowired
    private SsConsumService ssConsumService;
    @GetMapping("/getName")
    public R getName(@RequestParam("name") String name) {
        System.out.println(".......消费者open fegin调用.....配置中心................." + name);
        return ssConsumService.getName(name);
    }
}
