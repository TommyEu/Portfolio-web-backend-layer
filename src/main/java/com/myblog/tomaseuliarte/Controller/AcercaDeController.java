/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.Controller;

import com.myblog.tomaseuliarte.Model.AcercaDe;
import com.myblog.tomaseuliarte.service.IAcercaDeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author titie
 */
@Slf4j
@RestController
@RequestMapping("/acercade")
@CrossOrigin(origins = {"https://myblog-eac9f.web.app", "http://localhost:4200/"}, maxAge = 3600,
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class AcercaDeController {
    @Autowired
    private IAcercaDeService infoServ;
    
    @PostMapping("/new/info")
    public void crearInfo(@RequestBody AcercaDe info){
        infoServ.saveInfo(info);    
        log.info("Info creada");
    }
    @GetMapping("/traer/{id}")
    public AcercaDe traerInfo(@PathVariable Long id){
        log.info("obteniendo info...");
        return infoServ.viewInfo(id);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarInfo(@PathVariable Long id){
        infoServ.deleteInfo(id);
        log.info("info borrada");
    }
    @PutMapping("/editar/{id}")
    public void editarInfo(@PathVariable Long id, @RequestBody AcercaDe info){
        infoServ.editInfo(info);
        log.info("edicion exitosa");
    }
    
}
