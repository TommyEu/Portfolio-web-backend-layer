/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.Education;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author titie
 */

public interface IEducationService {
    public void createEducation(Education edu);
    public Optional<Education> getEducation(Long id);
    public List<Education> readAllEducation();
    public void updateEducation(Education edu);
    public void deleteInfo(Long id);
    
}
