package com.hudingwen.controller.handler;

import com.hudingwen.controller.entity.Code;
import com.hudingwen.controller.entity.Result;
import com.hudingwen.exception.BusinessException;
import com.hudingwen.exception.SystemException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName:ExceptionHandler
 * Package:com.hudingwen.controller
 * Description:异常拦截器,防止非法错误返回到前端
 * Date:2022-10-05 20:25:59
 * Author:胡丁文
 * E-mail:admin@aiwanyun.cn
 **/
@RestControllerAdvice
public class ProjectExceptionHandler {

    private Logger logger=Logger.getLogger(ProjectExceptionHandler.class);
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志(错误堆栈)
        //发送邮件给开发人员
        //发送短信给运维人员
        //系统异常
        logger.error(ex);
        return Result.Fail(ex.getMessage(),null,ex.getCode());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        //业务异常
        logger.warn(ex);
        return Result.Fail(ex.getMessage(),null,ex.getCode());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        //记录日志(错误堆栈)
        //发送邮件给开发人员
        //发送短信给运维人员
        //未知错误
        logger.error(ex);
        return Result.Fail("系统繁忙,请稍后再试!",null, Code.SYSTEM_UNKNOWN_ERR);
    }
}
