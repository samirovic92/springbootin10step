package com.samirovic.springbootin10step;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootin10stepApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(Springbootin10stepApplication.class, args);
        System.out.println(ctx.getBeanDefinitionNames());
    }

}
