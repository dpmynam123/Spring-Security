package com.wipro.Wipro_Security.Controller;

import com.wipro.Wipro_Security.entity.UserInfo;
import com.wipro.Wipro_Security.repository.UserRepository;
import com.wipro.Wipro_Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private UserRepository repo;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/register")
    public UserInfo createUser(@RequestBody UserInfo user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user) ;
    }
}