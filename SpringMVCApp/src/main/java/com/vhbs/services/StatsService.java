/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vhbs.services;

import java.util.List;

/**
 *
 * @author admin
 */
public interface StatsService {
    List<Object[]> statsRevenueByProdutc();
    List<Object[]> statsRevenueByPeroid(int year, String pred);
}
