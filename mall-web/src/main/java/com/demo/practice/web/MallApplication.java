package com.demo.practice.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.demo.practice.dao")
@SpringBootApplication(scanBasePackages = "com.demo.practice")
public class MallApplication {


    public static void main(String[] args) {

        SpringApplication.run(MallApplication.class, args);
    }
}
