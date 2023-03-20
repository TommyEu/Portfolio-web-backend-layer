/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myblog.tomaseuliarte.service;

import com.myblog.tomaseuliarte.Model.AcercaDe;

/**
 *
 * @author titie
 */
public interface IAcercaDeService {
    public AcercaDe viewInfo(Long id);
    public void saveInfo(AcercaDe info);
    public void deleteInfo(Long id);
    public void editInfo(AcercaDe info);
    
}
