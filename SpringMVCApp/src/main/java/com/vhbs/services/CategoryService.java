/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vhbs.services;

import com.vhbs.hibernateapp.pojo.Category;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public interface CategoryService {
    List<Category> getCates() ;
}
