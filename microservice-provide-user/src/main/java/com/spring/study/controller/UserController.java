package com.spring.study.controller;

import com.spring.study.entity.User;
import com.spring.study.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by 小&y on 2018/3/17 0017.
 *
 * @author 小&y
 */
@RestController
public class UserController{

    @Autowired
    private UserRepository userRepository;

    Logger logger = Logger.getLogger(UserController.class);

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        logger.info("参数为:" + id);
        User user = userRepository.findOne(id);
        return user;
    }
}
