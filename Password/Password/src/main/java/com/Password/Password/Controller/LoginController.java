package com.Password.Password.Controller;

import com.Password.Password.Entity.Login;

import com.Password.Password.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/saveUsers")
    public void saveTest(@RequestBody Login login) {
        loginService.save(login);
}
}

