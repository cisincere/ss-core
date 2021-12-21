package com.rinkoai.controller;

import com.rinkoai.common.util.R;
import com.rinkoai.service.SsConsumService;
import com.rinkoai.ss.param.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsConsumController {
    @Autowired
    private SsConsumService ssConsumService;

    @PostMapping("/login")
    public R getName(LoginParam user){
        System.out.println(".......消费者open fegin调用.....配置中心................." + user);
        return ssConsumService.getName(user);
    }
}
