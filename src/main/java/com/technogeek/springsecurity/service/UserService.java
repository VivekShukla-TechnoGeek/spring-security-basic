package com.technogeek.springsecurity.service;

import com.technogeek.springsecurity.entity.Users;
import com.technogeek.springsecurity.model.UsersRequest;
import com.technogeek.springsecurity.model.UsersResponse;
import com.technogeek.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public UsersResponse register(UsersRequest usersRequest) {
        Users user = new Users();
        user.setName(usersRequest.getName());
        user.setEmail(usersRequest.getEmail());
        user.setPassword(encoder.encode(usersRequest.getPassword()));
        repo.save(user);

        UsersResponse response = new UsersResponse();
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        return response;
    }
}
