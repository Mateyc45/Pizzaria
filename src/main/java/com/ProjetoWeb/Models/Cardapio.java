/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjetoWeb.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author mathe
 */
@Entity
@Table(name = "cardapio")
public class Cardapio implements Serializable{
    private static final long serializableVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String sabor;
    private String tamanho;
    private String preco;
    public Integer getId(){
        return id;
    }
    public void setID(Integer id){
        this.id = id;
    }
    
    public String getSabor(){
        return sabor;
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getPreco(){
        return preco;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }
}
