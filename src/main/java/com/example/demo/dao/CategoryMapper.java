/*
 * 项目名称:mybatisplus
 * 类名称:mapper.java
 * 包名称:com.example.demo.dao
 * 
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/5/22 08:36    WDD      初版完成
 *
 * Copyright (c) 2017-2019 咨同科技
 */
package com.example.demo.dao;/**
 * Created by WDD on 2019/5/22.
 */

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.category;
import com.example.demo.entity.users;
import org.apache.ibatis.annotations.Param;

/**
 * @author WDD
 */
public interface CategoryMapper extends BaseMapper<category>{

}