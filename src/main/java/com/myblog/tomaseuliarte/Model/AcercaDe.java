/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myblog.tomaseuliarte.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author titie
 */

@Getter @Setter
@Entity
//@Table(name = "acerca_de")
public class AcercaDe implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idacerca_de;    
    @Column
    private String name;
    @Column
    private String img;
    @Column
    private String coverImg;
    @Column
    private String info;
    @Column
    private String title;
    @Column
    private String ubication;
   
    
    public AcercaDe() {
    }

    public AcercaDe(Long idacerca_de, String img, String coverImg, String name, String info, String title, String ubication) {
        this.idacerca_de = idacerca_de;
        this.img = img;
        this.coverImg = coverImg;
        this.name = name;
        this.info = info;
        this.title = title;
        this.ubication = ubication;
        
    }
    
    
    
    
}
