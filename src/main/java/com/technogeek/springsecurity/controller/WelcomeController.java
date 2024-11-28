package com.technogeek.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String ping(HttpServletRequest request) {
        return "Welcome to the technogeek security with session id: " + request.getSession().getId();
    }

}
