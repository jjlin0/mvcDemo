package com.lcj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/15
 */
@Configuration
@ComponentScan({"com.lcj.dao", "com.lcj.service"})
@PropertySource("classpath:druid.properties")
@EnableTransactionManagement
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}