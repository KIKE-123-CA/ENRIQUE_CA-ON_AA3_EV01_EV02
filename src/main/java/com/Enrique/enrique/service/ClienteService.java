/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Enrique.enrique.service;

import com.Enrique.enrique.model.Cliente;

/**
 *
 * @author FAMILIA FELIZ
 */
public interface ClienteService {
   Cliente newCliente (Cliente newCliente);
   Iterable<Cliente> getAll();
   Cliente modiCliente (Cliente cliente);
   Boolean deleteCliente (Long iduser);
   
    
}
