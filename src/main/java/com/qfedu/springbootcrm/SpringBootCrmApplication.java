package com.qfedu.springbootcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qfedu.springbootcrm.mapper")
public class SpringBootCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrmApplication.class, args);
    }

}
