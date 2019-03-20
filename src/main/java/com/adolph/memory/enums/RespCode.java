package com.adolph.memory.enums;

/**
 * response code.
 *
 * @author adolph liu
 * 2019-3-20 19:04:13
 */
public enum RespCode {

    BAD_REQUEST(400, "bad request"),
    UNAUTHORIZED(401, "unauthorized"),
    RESOURCE_FORBIDDEN(403, "resource forbidden"),
    RESOURCE_NOT_FOUD(404, "resource not found"),
    SERVER_ERROR(500, "server error!");

    int code;
    String msg;

    RespCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
