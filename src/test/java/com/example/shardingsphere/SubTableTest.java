/*
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2019
 */
package com.example.shardingsphere;

import com.example.shardingsphere.entity.Order;
import com.example.shardingsphere.mapper.OrderMapper;
import com.example.shardingsphere.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 信牛 SubTableTest
 *
 * @author <a href="mailto:chenlushun@51nbapi.com">陈录顺</a>
 * @since 4.5.8
 */
public class SubTableTest extends DemoApplicationTests {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        orderMapper.deleteAll();

        orderMapper.insert(Order.builder().price(101L).userId(1L).build());
        orderMapper.insert(Order.builder().price(1025L).userId(2L).build());
        orderMapper.insert(Order.builder().price(1053L).userId(3L).build());
        orderMapper.insert(Order.builder().price(1047L).userId(4L).build());
        orderMapper.insert(Order.builder().price(105L).userId(5L).build());
        orderMapper.insert(Order.builder().price(127L).userId(6L).build());
        orderMapper.insert(Order.builder().price(109L).userId(7L).build());
        orderMapper.insert(Order.builder().price(104L).userId(8L).build());
        orderMapper.insert(Order.builder().price(107L).userId(9L).build());
        orderMapper.insert(Order.builder().price(110L).userId(10L).build());
    }

    @Test
    public void deleteALl() {

    }
}
