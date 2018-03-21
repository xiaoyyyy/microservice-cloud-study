package com.spring.study.interfaces;

import com.spring.study.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 小&y on 2018/3/21.
 */
@FeignClient("microservice-provide-user")
public interface FeignClients {

    //@RequestMapping(value = "feign/{id}",method = RequestMethod.GET)
    @GetMapping(value = "/user/{id}")
    User findByid(@PathVariable("id") long id);

}


