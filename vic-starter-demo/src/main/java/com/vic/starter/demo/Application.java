package com.vic.starter.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
//@Import({
//        WebApplication.class
//})
//@MapperScan("com.vic.starter.demo")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
