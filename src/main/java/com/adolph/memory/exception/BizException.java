package com.adolph.memory.exception;

import com.adolph.memory.enums.RespCode;

/**
 * This exception is used when the service happen error and can't continue execute the behind code.
 * respCode represent error cause.
 *
 * @see RespCode
 * @author adolph liu
 * 2019-3-20 19:06:09
 */
public class BizException extends RuntimeException{

    RespCode resp;

    public BizException(RespCode respCode) {
        this.resp = respCode;
    }

    public RespCode getResp() {
        return resp;
    }
}
