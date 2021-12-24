package com.rinkoai.fallback;

import com.rinkoai.common.error.CommonEnum;
import com.rinkoai.common.util.R;
import com.rinkoai.service.ISsPlanetObtainService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ISsPlanetObtainServiceFallback implements FallbackFactory<ISsPlanetObtainService> {
    final static Logger logger = LoggerFactory.getLogger(ISsPlanetObtainServiceFallback.class);
    @Override
    public ISsPlanetObtainService create(Throwable throwable) {
        logger.error("发生业务异常，{}", throwable.getMessage());
        return r -> R.error(CommonEnum.SERVER_BUSY);
    }
}
