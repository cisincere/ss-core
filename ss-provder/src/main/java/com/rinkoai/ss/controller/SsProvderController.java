package com.rinkoai.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss")
public class SsProvderController {
    @GetMapping("/test")
    public String getName(String name) {
        System.out.println("生产者");
        return name + "生产者";
    }
}
