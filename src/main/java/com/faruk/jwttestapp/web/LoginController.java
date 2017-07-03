/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.jwttestapp.web;

import com.faruk.jwttestapp.config.security.AccountCredentials;
import com.faruk.jwttestapp.domain.Users;
import com.faruk.jwttestapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Faruk
 */
@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> loginApplication(@RequestBody AccountCredentials accountCredentials) {

        return ResponseEntity.ok().body(accountCredentials.getUsername() + "\n" + accountCredentials.getPassword() + "\n" + "You can access this page");

    }

    @PostMapping("/singup")
    public ResponseEntity<Users> singupApplication(@RequestBody Users users) {

        Users result = userRepository.save(users);

        return ResponseEntity.ok().body(result);

    }

}
