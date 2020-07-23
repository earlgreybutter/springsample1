package com.dogfoot.sample.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import com.dogfoot.sample.Sample1ApplicationTests;
import com.dogfoot.sample.model.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends Sample1ApplicationTests {
    
    @Autowired
    private UserRepository userRepository;

    // 여기 Test랑 extends한 class를 잘 해결해봐라 
    @Test
    public void create(){
        User user = new User();
        user.setName("name");
        user.setEmail("email");
        user.setPhoneNumber("phoneNumber");
        user.setRegDt(LocalDateTime.now());
        user.setRegUser("regUser");

        User newUser = userRepository.save(user);
        System.out.println(newUser);

    }

    @Test
    public void read(){
        Optional<User> user = userRepository.findById(1L);

        user.ifPresent(selectUser -> {
            System.out.println("user : " + selectUser);
        });
    }


}