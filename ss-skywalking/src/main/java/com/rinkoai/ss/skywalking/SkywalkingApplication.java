package com.rinkoai.ss.skywalking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class SkywalkingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkywalkingApplication.class, args);
    }
}
