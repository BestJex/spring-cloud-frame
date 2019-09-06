package com.jex.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestPathConfig {

    /**
     * spring cloud 配置方式之一，启动主程序配置，还有一种是配置文件配置
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route(r ->

                r.path("/**")
                        .uri("http://www.qq.com"))
                .build();
    }
}
