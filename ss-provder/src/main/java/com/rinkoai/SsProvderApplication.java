package com.rinkoai;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

@SpringCloudApplication
public class SsProvderApplication {
    public static void main(String[] args) {
       SpringApplication.run(SsProvderApplication.class, args);
    }
}
