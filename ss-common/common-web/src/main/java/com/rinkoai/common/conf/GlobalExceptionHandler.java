package com.rinkoai.common.conf;

import com.rinkoai.common.error.BizException;
import com.rinkoai.common.util.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BizException.class)
    public R handlerBizException(BizException e){
        logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
        return R.error(e.getErrorCode(), e.getMessage());
    }
}
