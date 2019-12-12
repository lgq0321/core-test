package com.lgq.cn;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/12 9:33
 */
@Configuration
@EnableConfigurationProperties
public class DemoConfig {
    @Bean
    public Demo demo(){
        return new Demo();
    }
}
