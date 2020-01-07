package com.example.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableCaching // 开启缓存
//@EnableTransactionManagement // 开启事务，保证redis与mysql中数据的一致性
public class RedisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisdemoApplication.class, args);
    }

}
