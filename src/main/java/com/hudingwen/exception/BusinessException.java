package com.hudingwen.exception;

/**
 * ClassName:SystemException
 * Package:com.hudingwen.exception
 * Description:描述
 * Date:2022-10-05 20:46:57
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
