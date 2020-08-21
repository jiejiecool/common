package com.example.demo1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import zhouhe.Person2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootApplication
@EnableDubboConfiguration
public class Demo1Application {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
       SpringApplication.run(Demo1Application.class, args);

    }

}
