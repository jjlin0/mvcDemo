package com.lcj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/17
 */
@Configuration
@ComponentScan("com.lcj.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
