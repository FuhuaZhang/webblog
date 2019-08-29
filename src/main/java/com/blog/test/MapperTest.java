package com.blog.test;


import com.blog.dao.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        System.out.println(ctx.getBean(UserMapper.class));
    }

}
