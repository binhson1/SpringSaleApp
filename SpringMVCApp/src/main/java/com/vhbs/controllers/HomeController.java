/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vhbs.controllers;

import com.vhbs.services.CategoryService;
import com.vhbs.services.ProductService;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
@ControllerAdvice
public class HomeController {
//    @Autowired
//    private LocalSessionFactoryBean factory;
    
    @Autowired
    private CategoryService cateService;
    
    @Autowired
    private ProductService prodService;
    
    @ModelAttribute
    public void commonAttributes(Model model){
        model.addAttribute("cates", this.cateService.getCates());
    }
    @RequestMapping("/")
//    @Transactional
    public String index(Model model, @RequestParam Map<String, String> params){
//        Session s = this.factory.getObject().getCurrentSession();
//        Query q = s.createQuery("From Category");
        
        model.addAttribute("prods", this.prodService.getProducts(params));
            return "index";
    }
}
