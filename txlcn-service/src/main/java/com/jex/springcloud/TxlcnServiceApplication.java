package com.jex.springcloud;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagerServer
public class TxlcnServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxlcnServiceApplication.class, args);
		Logger logger = LoggerFactory.getLogger(TxlcnServiceApplication.class);
		logger.info("**********************************");
		logger.info(" **** txlcn-server 启动成功 **** ");
		logger.info("**********************************");
	}
}
