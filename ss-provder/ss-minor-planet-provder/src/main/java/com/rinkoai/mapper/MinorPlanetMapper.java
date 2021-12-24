package com.rinkoai.mapper;

import com.rinkoai.ss.pojo.MinorPlanet;

public interface MinorPlanetMapper {

    /**
     * 根据编号查询小行星数据
     */
    MinorPlanet selectByNumber(String number);

}
