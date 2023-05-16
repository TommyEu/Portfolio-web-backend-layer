/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.Education;
import com.myblog.tomaseuliarte.Repository.EducationRepository;
import java.util.List;
import java.util.Optional;
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
    public Optional<Education> getEducation(Long id){
        return eduRepo.findById(id);
    }
    @Override
    public void updateEducation(Long id) {
        eduRepo.save(eduRepo.getById(id));
    }

    @Override
    public void deleteInfo(Long id) {
        eduRepo.deleteById(id);
    }
    
}
