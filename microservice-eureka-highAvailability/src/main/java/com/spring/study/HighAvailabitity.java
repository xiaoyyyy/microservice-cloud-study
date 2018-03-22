package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 小&y on 2018/3/22 0022.
 *
 * @author 小&y
 */
@SpringBootApplication
@EnableEurekaServer
public class HighAvailabitity {

    public static void main(String[] args) {
        SpringApplication.run(HighAvailabitity.class,args);
        System.out.println("启动成功^-^");
    }
}
