/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.jwttestapp.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Faruk
 */
@RestController
public class UsersController {
    
    @GetMapping("/users")
    public ResponseEntity<String> getUsers(){
    
        return ResponseEntity.ok("You can access this page");
        
    }
    
}
