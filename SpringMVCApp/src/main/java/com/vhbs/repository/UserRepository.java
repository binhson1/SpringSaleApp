/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vhbs.repository;

import com.vhbs.hibernateapp.pojo.User;



/**
 *
 * @author admin
 */
public interface UserRepository {
    User getUserByUserName(String username);
}
