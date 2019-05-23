/*
 * 项目名称:mybatisplus
 * 类名称:demo.java
 * 包名称:com.example.demo.entity
 * 
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/5/22 09:09    WDD      初版完成
 *
 * Copyright (c) 2017-2019 咨同科技
 */
package com.example.demo.entity;/**
 * Created by WDD on 2019/5/22.
 */

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author WDD
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class users extends Model<users> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String username;
    private String password;
    private String email;

}