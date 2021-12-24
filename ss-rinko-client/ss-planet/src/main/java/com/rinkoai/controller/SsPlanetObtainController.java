package com.rinkoai.controller;


import com.rinkoai.common.util.R;
import com.rinkoai.service.ISsPlanetObtainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsPlanetObtainController {

    @Autowired
    private ISsPlanetObtainService planetObtainService;

    @GetMapping("/planet/{number}")
    public R getPlanetByNumber(@PathVariable("number")String number) {
        return  planetObtainService.getPlanetByNumber(number);
    }

}
