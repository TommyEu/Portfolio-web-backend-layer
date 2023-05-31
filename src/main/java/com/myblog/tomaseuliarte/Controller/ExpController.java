/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.Controller;

import com.myblog.tomaseuliarte.Model.Exp;
import com.myblog.tomaseuliarte.service.IExpService;
import java.util.List;
import java.util.Optional;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author titie
 */
@Slf4j
@RequestMapping("/experiencia")
@CrossOrigin(origins = {"https://myblog-eac9f.web.app", "http://localhost:4200/"})
@RestController
public class ExpController {

    @Autowired
    private IExpService expServ;
    
    @PostMapping("/nuevo")
    public void crearExp(@RequestBody Exp edu) {
        expServ.createExp(edu);
    }
    @GetMapping("/traer/{id}")
    public Optional<Exp> traerPorId(@PathVariable Long id) {
        return expServ.getExp(id);
    }
    @GetMapping("traer/todos")
    public List<Exp> traerLista(){
        return expServ.readAllExp();
    }
    
    @PutMapping("editar/{id}")
    public void modificarExp(@RequestBody Exp edu, @PathVariable Long id) {
        expServ.updateExp(edu);
    }
    @DeleteMapping("borrar/{id}")
    public void borrarExp(@PathVariable Long id) {
        expServ.deleteExp(id);
    }

}
