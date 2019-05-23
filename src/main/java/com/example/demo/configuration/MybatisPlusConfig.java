/*
 * 项目名称:mybatisplus
 * 类名称:MybatisPlusConfig.java
 * 包名称:com.example.demo.configuration
 * 
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/5/22 10:57    WDD      初版完成
 *
 * Copyright (c) 2017-2019 咨同科技
 */
package com.example.demo.configuration;/**
 * Created by WDD on 2019/5/22.
 */

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author WDD
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.example.demo.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}