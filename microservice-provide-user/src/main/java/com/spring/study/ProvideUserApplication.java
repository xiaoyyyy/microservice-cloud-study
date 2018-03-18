package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by 小&y on 2018/2/28 0028.
 *
 * @author 小&y
 */
@SpringBootApplication
@Configuration
@ImportResource(locations = {"classpath:spring-application.xml"})
public class ProvideUserApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProvideUserApplication.class,args);
    }
}
