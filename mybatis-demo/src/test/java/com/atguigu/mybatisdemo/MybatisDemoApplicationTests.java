package com.atguigu.mybatisdemo;

import com.atguigu.mybatisdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
        System.out.println(this.userMapper.selectById(1l));
    }

}
