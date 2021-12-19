package com.rinkoai.controller;

import com.rinkoai.common.util.R;
import com.rinkoai.ss.pojo.SsUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss")
public class SsProvderController {
    @GetMapping("/test")
    public R getName(String name) {
        SsUser ssUser = new SsUser();
        ssUser.setName(name);
        return R.success(ssUser);
    }
}
