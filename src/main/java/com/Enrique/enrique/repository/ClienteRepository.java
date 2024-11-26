/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Enrique.enrique.repository;

import com.Enrique.enrique.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author FAMILIA FELIZ
 */
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
