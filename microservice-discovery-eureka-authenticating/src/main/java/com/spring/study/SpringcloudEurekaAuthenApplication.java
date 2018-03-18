package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 小&y
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudEurekaAuthenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaAuthenApplication.class, args);
	}
}
