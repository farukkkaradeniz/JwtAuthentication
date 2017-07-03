/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faruk.jwttestapp.repository;

import com.faruk.jwttestapp.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Faruk
 */
public interface UserRepository extends JpaRepository<Users,Long>{
    
    Users findOneByUserName(String userName);

}
