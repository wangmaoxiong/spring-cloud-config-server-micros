package com.wmx.springcloudconfigservermicros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerMicrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerMicrosApplication.class, args);
    }

}
