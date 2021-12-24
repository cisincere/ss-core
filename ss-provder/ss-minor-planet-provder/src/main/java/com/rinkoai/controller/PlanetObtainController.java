package com.rinkoai.controller;

import com.rinkoai.common.util.R;
import com.rinkoai.service.IPlanetObtainService;
import com.rinkoai.ss.pojo.MinorPlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planet")
public class PlanetObtainController {

    @Autowired
    private IPlanetObtainService planetObtainService;



    @GetMapping("/{number}")
    public R getPlanetByNumber(@PathVariable("number")String number) {
        return R.success(planetObtainService.getPlanetByNumber(number));
    }

}
