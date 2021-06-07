package com.rinkoai.ss.controller;

import com.rinkoai.ss.service.SsConsumService;
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
    @GetMapping("/getNmae")
    public String getName(@RequestParam("name") String name) {
        String names = ssConsumService.getName(name);
        System.out.println(".......消费者open fegin调用.....配置中心................." + names);
        return names;
    }
}
