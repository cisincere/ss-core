package com.rinkoai.config;

import com.rinkoai.common.error.CommonEnum;
import com.rinkoai.common.util.R;
import com.rinkoai.service.SsConsumService;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SentinelExceptionHandlerFallback implements FallbackFactory<SsConsumService> {
    final static Logger logger = LoggerFactory.getLogger(SentinelExceptionHandlerFallback.class);

    @Override
    public SsConsumService create(Throwable throwable) {
        logger.error("发生业务异常，{}", throwable.getMessage());
        return name -> R.error(CommonEnum.SERVER_BUSY);
    }
}
