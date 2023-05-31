package com.myblog.tomaseuliarte.Model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "experience")
public class Exp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String enterprise;
    private String title;
    private String img;
    private String description;

    @Column(name = "initial_date")
    private int initialDate;

    @Column(name = "final_date")
    private int finalDate;

    // Constructor vacío
    public Exp() {
    }

    // Constructor con todos los parámetros
    public Exp(Long id, String title, String enterprise, String img, String description, int initialDate, int finalDate) {
        this.id = id;
        this.title = title;  
        this.enterprise = enterprise;
        this.img = img;
        this.description = description;
        this.initialDate = initialDate;
        this.finalDate = finalDate;        
    }
}
