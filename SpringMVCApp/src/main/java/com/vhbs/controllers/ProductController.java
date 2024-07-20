/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vhbs.controllers;

import com.cloudinary.utils.ObjectUtils;
import com.vhbs.hibernateapp.pojo.Product;
import com.vhbs.hibernateapp.pojo.User;
import com.vhbs.services.ProductService;
import java.io.IOException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author admin
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService prodService;
                
                
            
                
    @GetMapping("/product")
    public String Admin(Model model) {
        model.addAttribute("product", new Product());
        return "product";
    }
    
    @PostMapping("/product")
    public String create(Model model, @ModelAttribute(value = "product") @Valid Product p, BindingResult rs) {
        if (rs.hasErrors()) {
            
            return "product";
        } else {
            prodService.addOrUpdate(p);
            return "redirect:/";
        }
    }       
}
