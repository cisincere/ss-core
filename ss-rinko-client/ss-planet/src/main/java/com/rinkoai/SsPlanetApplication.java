package com.rinkoai;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class SsPlanetApplication {
    public static void main(String[] args){
        SpringApplication.run(SsPlanetApplication.class, args);
    }
}
