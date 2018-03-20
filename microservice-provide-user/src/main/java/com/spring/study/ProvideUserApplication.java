package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by 小&y on 2018/2/28 0028.
 *
 * @author 小&y
 */
@SpringBootApplication
@EnableEurekaClient
@ImportResource(locations = {"classpath:spring-application.xml"})
public class ProvideUserApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProvideUserApplication.class,args);
        System.out.println("^-^");
    }
}
