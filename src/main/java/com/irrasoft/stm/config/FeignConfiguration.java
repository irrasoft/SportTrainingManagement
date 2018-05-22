package com.irrasoft.stm.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.irrasoft.stm")
public class FeignConfiguration {

}
