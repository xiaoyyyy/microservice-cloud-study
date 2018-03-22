package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 小&y on 2018/3/6 0006.
 *
 * @author 小&y
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaHighAvailabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHighAvailabilityApplication.class,args);
    }
}
