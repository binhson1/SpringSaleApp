/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vhbs.repository.impl;

//import com.vhbs.hibernateapp.HibernateUtils;
import com.vhbs.hibernateapp.pojo.Category;
import com.vhbs.repository.CategoryRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository{
    @Autowired
    private LocalSessionFactoryBean factory;
    public List<Category> getCates() {
//        try (Session s = HibernateUtils.getFactory().openSession()){
            Session s = this.factory.getObject().getCurrentSession();
            Query q = s.createQuery("From Category");
            return q.getResultList();
//        }
    }
}
        
