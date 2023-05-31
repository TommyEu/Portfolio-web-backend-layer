/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.Exp;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author titie
 */

public interface IExpService {
    public void createExp(Exp edu);
    public Optional<Exp> getExp(Long id);
    public List<Exp> readAllExp();
    public void updateExp(Exp edu);
    public void deleteExp(Long id);
}