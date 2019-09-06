package com.jex.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
        Logger logger = LoggerFactory.getLogger(GatewayServiceApplication.class);
        logger.info("**********************************");
        logger.info("**** gateway-service 启动成功 ****");
        logger.info("**********************************");
    }
}
