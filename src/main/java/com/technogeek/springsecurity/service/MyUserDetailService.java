package com.technogeek.springsecurity.service;

import com.technogeek.springsecurity.entity.Users;
import com.technogeek.springsecurity.model.UserPrinciple;
import com.technogeek.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepo.findByEmail(username);
        if(users == null)
            throw new UsernameNotFoundException("User not found.");
        return new UserPrinciple(users);
    }
}
