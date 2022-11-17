package com.lcj.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description: 切面异常处理器
 * @author: 李传江
 * @date: 2022/11/18
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println("抓住异常了!");
        return new Result(666,ex);
    }
}
