package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com")//可以加大括号写多个
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
