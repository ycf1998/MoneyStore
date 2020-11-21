package com.money.store.openplatform.config;

import com.money.store.common.api.CommonResult;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @program: store
 * @description: 全局异常处理
 * @author: Money
 * @create: 2020/11/01 17:18:27
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {
    /**
     * 参数校验失败异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(BindException.class)
    public CommonResult MethodArgumentNotValidExceptionHandler(BindException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return CommonResult.validateFailed(objectError.getDefaultMessage());
    }

    /**
     * SQL异常
     * @param e
     * @return
     */
    @ExceptionHandler(SQLException.class)
    public CommonResult SQLExceptionExceptionHandler(SQLException e) {
        return CommonResult.failed(e.getSQLState() + "：" +  e.getMessage());
    }
}
