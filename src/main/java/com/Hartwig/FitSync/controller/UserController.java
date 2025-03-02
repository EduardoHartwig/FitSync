package com.Hartwig.FitSync.controller;


import com.Hartwig.FitSync.model.User;
import com.Hartwig.FitSync.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/register")
    public ResponseEntity<User> registerUser() {
        User user = new User("Teste da Silva", "testedasilva@gmail.com");

        return ResponseEntity.status(HttpStatus.OK).body(userService.registerUser(user));
    }
}
