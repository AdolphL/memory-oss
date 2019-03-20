package com.adolph.memory.aop;

import com.adolph.memory.enums.RespCode;
import com.adolph.memory.exception.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

/**
 * global exception handler.
 *
 * @author adolph liu
 * 2019-3-20 19:15:47
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BizException.class)
    public String handleBizException(BizException exception, HttpServletResponse response) {
        response.setStatus(exception.getResp().getCode());
        return exception.getResp().getMsg();
    }

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletResponse response, Exception exception) {
        logger.error("error", exception);
        //later add email notification
        response.setStatus(RespCode.SERVER_ERROR.getCode());
        return RespCode.SERVER_ERROR.getMsg();
    }

}
