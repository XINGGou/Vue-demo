package com.xxh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxh.dao")
public class VueDay04Application {

    public static void main(String[] args) {
        SpringApplication.run(VueDay04Application.class, args);
    }

}
