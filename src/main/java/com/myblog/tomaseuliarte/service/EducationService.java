/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.Education;
import com.myblog.tomaseuliarte.Repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author titie
 */
@Service
public class EducationService implements IEducationService{
    @Autowired
    private EducationRepository eduRepo;
    
    @Override
    public void createEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public List<Education> readAllEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void updateEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteInfo(Long id) {
        eduRepo.deleteById(id);
    }
    
}
