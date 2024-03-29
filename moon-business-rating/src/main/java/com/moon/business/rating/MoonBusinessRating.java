package com.moon.business.rating;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"com.moon.business.rating.repo.mapper"})
public class MoonBusinessRating {
    public static void main(String[] args) {
        SpringApplication.run(MoonBusinessRating.class, args);
    }
}
