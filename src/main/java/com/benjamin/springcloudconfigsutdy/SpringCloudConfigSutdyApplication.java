package com.benjamin.springcloudconfigsutdy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigSutdyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigSutdyApplication.class,
                args);
    }

}
