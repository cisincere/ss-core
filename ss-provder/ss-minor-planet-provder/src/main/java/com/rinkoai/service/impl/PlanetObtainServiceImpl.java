package com.rinkoai.service.impl;

import com.rinkoai.common.error.BizException;
import com.rinkoai.common.error.CommonEnum;
import com.rinkoai.mapper.MinorPlanetMapper;
import com.rinkoai.service.IPlanetObtainService;
import com.rinkoai.ss.pojo.MinorPlanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PlanetObtainServiceImpl implements IPlanetObtainService {

    @Autowired
    private MinorPlanetMapper minorPlanetMapper;

    /**
     * 根据编号获取小行星数据
     *
     * @param number 编号
     * @return 小型数据
     */
    @Override
    public MinorPlanet getPlanetByNumber(String number) {
        MinorPlanet minorPlanet = selectByNumber(number);
        if (Objects.isNull(minorPlanet)) {
            throw new BizException(CommonEnum.PLANET_NOT_FOUND);
        }
        return minorPlanet;
    }

    private MinorPlanet selectByNumber(String number) {
        return minorPlanetMapper.selectByNumber(number);
    }
}
