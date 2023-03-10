package com.sfx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableTest
public class AuthSecurityApplication {
    private static final Logger log = LoggerFactory.getLogger(AuthSecurityApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =SpringApplication.run(AuthSecurityApplication.class,args);
        context.getBean("com.sfx.Config.Animal");

    }

}
