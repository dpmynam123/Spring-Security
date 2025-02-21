package com.wipro.Wipro_Security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {

    @GetMapping("/home")
    public String hello(){
        return "home";
    }
    @GetMapping("/user/home")
    public String user(){
        return "home_user";
    }
    @GetMapping("/admin/home")
    public String admin(){
        return "home_admin";
    }
    @GetMapping("/login")
    public String handleLogin() {
        return "custom_login";
    }
}