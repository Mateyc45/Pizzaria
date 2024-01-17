/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProjetoWeb.Repository;

import com.ProjetoWeb.Models.Pedido;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mathe
 */
public interface PedidoRepository extends CrudRepository<Pedido,String>{
    
}
