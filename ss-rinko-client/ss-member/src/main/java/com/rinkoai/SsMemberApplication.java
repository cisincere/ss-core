package com.rinkoai;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class SsMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsMemberApplication.class, args);
    }
}
