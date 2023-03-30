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
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author titie
 */
@Getter @Setter
@Entity
@Table(name = "education")
public class Education implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducation;
    @Column
    private String name;
    @Column
    private String career;
    @Column
    private int initialDate;
    @Column
    private int finalDate;
    @Column
    private String img;

    public Education() {
    }

    public Education(Long idEducation, String name, String career, int initialDate, int finalDate, String img) {
        this.idEducation = idEducation;
        this.name = name;
        this.career = career;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
        this.img = img;
    }
    
    
    
}
