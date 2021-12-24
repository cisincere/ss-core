package com.rinkoai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@MapperScan("com.rinkoai.mapper")
public class SsMinorPlanetProvderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsMinorPlanetProvderApplication.class, args);
    }
}
