package com.lcj.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @description: 统一数据返回结果类
 * 表现层数据封装
 * @author: 李传江
 * @date: 2022/11/18
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }
}
