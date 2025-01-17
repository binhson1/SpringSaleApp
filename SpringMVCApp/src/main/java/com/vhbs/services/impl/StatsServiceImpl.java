/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vhbs.services.impl;

import com.vhbs.repository.StatsRepository;
import com.vhbs.services.StatsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class StatsServiceImpl implements StatsService{
    @Autowired
    private StatsRepository statsRepo;
    
    @Override
    public List<Object[]> statsRevenueByProdutc() {
        return this.statsRepo.statsRevenueByProdutc();
    }

    @Override
    public List<Object[]> statsRevenueByPeroid(int year, String pred) {
        return this.statsRevenueByPeroid(year, pred);
    }
    
}
