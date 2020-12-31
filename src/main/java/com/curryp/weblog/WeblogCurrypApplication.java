package com.curryp.weblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WeblogCurrypApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeblogCurrypApplication.class, args);
    }

}
