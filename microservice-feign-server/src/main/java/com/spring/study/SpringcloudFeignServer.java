package com.spring.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 小&y
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudFeignServer {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFeignServer.class, args);
		System.out.println("启动成功^-^");
	}
}
