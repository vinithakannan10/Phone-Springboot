package com.Password.Password.Service;

import com.Password.Password.Entity.Login;
import com.Password.Password.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public String save(Login login) {
        login.setAndEncryptPassword(login.getPassword());
        loginRepository.save(login);
        return "saved";
    }
}