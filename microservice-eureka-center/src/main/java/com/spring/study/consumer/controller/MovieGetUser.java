package com.spring.study.consumer.controller;

import com.spring.study.consumer.entity.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 小&y on 2018/3/18 0018.
 *
 * @author 小&y
 */
@RestController
public class MovieGetUser {

    @Autowired
    private RestTemplate restTemplate;

    Logger logger = Logger.getLogger(MovieGetUser.class);

    @Value("${user.path}")
    private String path;

    @GetMapping("/movie/{id}")
    public User getUser(@PathVariable Long id){
        logger.info("路径为:" + this.path);
        ResponseEntity<User> user = this.restTemplate.getForEntity(this.path + id,User.class);
        return user.getBody();
//        return this.restTemplate.getForObject(this.path + id,User.class);
    }


}
