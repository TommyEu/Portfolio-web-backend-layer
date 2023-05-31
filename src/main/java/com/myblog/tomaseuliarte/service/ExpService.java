/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.Exp;
import com.myblog.tomaseuliarte.Repository.ExpRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author titie
 */
@Service
public class ExpService implements IExpService{
    
    @Autowired
    private ExpRepository expRepo;
    
    @Override
    public void createExp(Exp edu) {
        expRepo.save(edu);
    }

    @Override
    public Optional<Exp> getExp(Long id) {
        return expRepo.findById(id);
    }

    @Override
    public List<Exp> readAllExp() {
        return expRepo.findAll();
    }

    @Override
    public void updateExp(Exp edu) {
        expRepo.save(edu);
    }

    @Override
    public void deleteExp(Long id) {
        expRepo.deleteById(id);
    }
    
}
