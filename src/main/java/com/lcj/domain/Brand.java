package com.lcj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/07
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    private Integer id;
    private String brandName;
    private String companyName;
    private String slogan;
    private String remarks;
    private Integer status;
}
