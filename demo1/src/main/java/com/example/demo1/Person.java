package com.example.demo1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2019/11/19 14:11
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person{
    private String name;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    protected void say() {
        System.out.println("123");
    }


}
