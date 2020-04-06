package com.money.store.openplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.money.store")
public class StoreOpenplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreOpenplatformApplication.class, args);
    }

}
