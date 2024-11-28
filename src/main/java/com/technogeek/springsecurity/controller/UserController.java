package com.technogeek.springsecurity.controller;

import com.technogeek.springsecurity.model.UsersRequest;
import com.technogeek.springsecurity.model.UsersResponse;
import com.technogeek.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("/register")
    public UsersResponse register(@RequestBody UsersRequest user) {
        return service.register(user);
    }
}
