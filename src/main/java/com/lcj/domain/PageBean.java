package com.lcj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description: 
 * @author: 李传江
 * @date: 2022/11/18
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
    private Integer totalCount;
    private List<T> rows;
}
