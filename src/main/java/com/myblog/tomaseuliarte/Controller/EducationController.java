/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.Controller;

import com.myblog.tomaseuliarte.Model.Education;
import com.myblog.tomaseuliarte.service.EducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author titie
 */
@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = {"https://myblog-eac9f.web.app", "http://localhost:4200"})
public class EducationController {
    @Autowired
    public EducationService eduServ;
    
    @PostMapping("/new/education")
    public void crearEducation(Education edu){
        eduServ.createEducation(edu);
    }
    @GetMapping("/traer/lista-education")
    public List<Education> traerTodosEdu(){
        return eduServ.readAllEducation();
    }
    @PutMapping("/edit/education")
    public void editarEducation(Education edu){
        eduServ.updateEducation(edu);
    }   
    @DeleteMapping("/delete/{id}")
    public void borrarEducation(@PathVariable Long id){
        eduServ.deleteInfo(id);
    }
}
