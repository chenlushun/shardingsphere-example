/*
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2019
 */
package com.example.shardingsphere.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 信牛 User
 *
 * @author <a href="mailto:chenlushun@51nbapi.com">陈录顺</a>
 * @since 4.5.8
 */
@Data
@Builder
public class User {

    private Long id;
    private Integer age;
    private String name;


}
