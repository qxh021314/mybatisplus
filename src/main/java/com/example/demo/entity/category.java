/*
 * 项目名称:mybatisplus
 * 类名称:category.java
 * 包名称:com.example.demo.entity
 * 
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/5/22 08:35    WDD      初版完成
 *
 * Copyright (c) 2017-2019 咨同科技
 */
package com.example.demo.entity;/**
 * Created by WDD on 2019/5/22.
 */

import lombok.Data;

/**
 * @author WDD
 */
@Data
public class category {
    private Integer cid;
    private String image;
    private String message;
    private Double price;
    private String status;
    private String details;
    private Integer quantity;
}