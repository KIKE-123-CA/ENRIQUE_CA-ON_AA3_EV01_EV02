/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Enrique.enrique.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author FAMILIA FELIZ
 */

@Entity
@Data

public class Cliente {
@Id
   @Column
   private Long iduser;
   
   @Column
   private String nombre;
   
   @Column 
   private String apelllido;
   
   @Column 
   private String email;    
}
