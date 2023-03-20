/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.AcercaDe;
import com.myblog.tomaseuliarte.Repository.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author titie
 */
@Service
public class AcercaDeService implements IAcercaDeService{
    @Autowired
    private AcercaDeRepository infoRepo;
    
    @Override
    public AcercaDe viewInfo(Long id){
        return infoRepo.findById(id).orElse(null);
    }
    @Override
    public void saveInfo(AcercaDe info){
        infoRepo.save(info);
    }
    @Override
    public void deleteInfo(Long id){
       infoRepo.deleteById(id);
    }
    @Override
    public void editInfo(AcercaDe info){
        infoRepo.save(info);
    }
}
