package com.spring.study.controller;

import com.spring.study.entity.User;
import com.spring.study.interfaces.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 小&y on 2018/3/21.
 */
@RestController
public class FeignController {

    @Autowired
    private FeignClients feignClients;

    @GetMapping("/feign/{id}")
    public User findByid(@PathVariable long id){
        return feignClients.findByid(id);
    }
}
