/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vhbs.services.impl;

import com.vhbs.hibernateapp.pojo.Product;
import com.vhbs.repository.ProductRopository;
import com.vhbs.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRopository proRe;

    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.proRe.getProducts(params);
    }

    @Override
    public void addOrUpdate(Product p) {
        this.proRe.addOrUpdate(p);
    }

    @Override
    public Product getProduct(int id) {
        return this.proRe.getProductById(id);
    }
}
