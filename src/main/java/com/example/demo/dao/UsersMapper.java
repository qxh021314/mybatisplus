/*
 * 项目名称:mybatisplus
 * 类名称:demo.java
 * 包名称:com.example.demo.dao
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2019/5/22 09:11    WDD      初版完成
 *
 * Copyright (c) 2017-2019 咨同科技
 */
package com.example.demo.dao;/**
 * Created by WDD on 2019/5/22.
 */

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.entity.users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author WDD
 */
public interface UsersMapper extends BaseMapper<users> {
    @Select("select * from users")
    IPage<users> selectPage2(IPage<users> page, @Param(Constants.WRAPPER) Wrapper<users> wrapper);
}