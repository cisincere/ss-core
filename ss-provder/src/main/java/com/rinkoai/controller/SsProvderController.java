package com.rinkoai.controller;

import com.rinkoai.common.error.BizException;
import com.rinkoai.common.util.R;
import com.rinkoai.ss.pojo.SsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ss")
public class SsProvderController {
    @GetMapping("/test")
    public R getName(String name) {
        throw new BizException("28", "11");
//        SsUser ssUser = new SsUser();
//        ssUser.setUsername(name);
//        System.out.println(ssUser);
//        return R.success(ssUser);
    }
}
