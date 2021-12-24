package com.rinkoai.service;

import com.rinkoai.ss.pojo.MinorPlanet;

public interface IPlanetObtainService {

    /**
     * 根据编号获取小行星数据
     * @param number 编号
     * @return 小型数据
     */
    MinorPlanet getPlanetByNumber(String number);
}
