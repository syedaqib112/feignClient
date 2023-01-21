package com.learn.spring.feign.api.controller;

import com.learn.spring.feign.api.client.UserClient;
import com.learn.spring.feign.api.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class getAllUser {

    @Autowired
    UserClient userClient;

    @GetMapping("/findAllUser")
    public List<UserResponse> getAllUSer() {
        return userClient.getUsers();
    }
}
