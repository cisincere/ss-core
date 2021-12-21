package com.rinkoai.controller;

import com.rinkoai.common.util.R;
import com.rinkoai.service.ISsLoginService;
import com.rinkoai.ss.pojo.SsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsLoginController {

    @Autowired
    public ISsLoginService ssLoginService;

    @PostMapping("/login")
    public R login(SsUser user) {
        return R.success(ssLoginService.login(user));
    }
}
