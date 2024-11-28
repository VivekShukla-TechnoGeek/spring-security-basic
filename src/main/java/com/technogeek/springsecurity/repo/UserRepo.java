package com.technogeek.springsecurity.repo;

import com.technogeek.springsecurity.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
}
