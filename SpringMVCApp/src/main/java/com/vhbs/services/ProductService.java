/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vhbs.services;

import com.vhbs.hibernateapp.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ACER
 */
public interface ProductService {
    List<Product> getProducts(Map<String, String> params);
    public void addOrUpdate(Product p);
    public Product getProduct(int id);
}
