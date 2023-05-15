/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.Controller;

import com.myblog.tomaseuliarte.Model.Education;
import com.myblog.tomaseuliarte.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
/**
 *
 * @author titie
 */
@Slf4j
@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = {"https://myblog-eac9f.firebaseapp.com", "https://myblog-eac9f.web.app", "http://localhost:4200"})

public class EducationController {
    @Autowired
    private IEducationService eduServ;
    
    @PostMapping("/new/education")
    public void crearEducation(@RequestBody Education edu){
        eduServ.createEducation(edu);
        log.info("educacion creada");
    }
    @GetMapping("/traer/lista-education")
    public List<Education> traerTodosEdu(){
        log.info("trayendo lista educacion...");
        return eduServ.readAllEducation();
    }
    @PutMapping("/edit/{id}")
    public void editarEducation(@PathVariable Long id){
        eduServ.updateEducation(id);
        log.info("edición exitosa de la entidad N°" + id);
    }   
    @DeleteMapping("/delete/{id}")
    public void borrarEducation(@PathVariable Long id){
        eduServ.deleteInfo(id);
        log.info("borrado exitoso de la entidad N°" + id);
    }
}
