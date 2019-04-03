/*
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2019
 */
package com.example.shardingsphere.mapper;

import com.example.shardingsphere.entity.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 信牛 UserMapper
 *
 * @author <a href="mailto:chenlushun@51nbapi.com">陈录顺</a>
 * @since 4.5.8
 */
public interface UserMapper {

    int insert(Order order);

    @Delete("delete from user where id=#{id}")
    int deleteById(@Param("id") Long id);
    @Delete("delete from user")
    int deleteAll();

    int update(Order order);

    @Select("select * from user where id=#{id}")
    Order queryById(@Param("id") Long id);
}
