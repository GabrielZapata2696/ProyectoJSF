/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectowebjsf.controller;


import java.io.Serializable;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.enterprise.context.ApplicationScoped;


/**
 *
 * @author SpacemanFromHell
 */

//@ManagedBean(name = "indexController", eager = false )
//@RequestScoped
//@ApplicationScoped
//@SessionScoped
@Named(value = "indexController")
@ViewScoped

public class IndexController implements Serializable{
    
    private String world= "UNIVERSIDAD DE CUNDINAMARCA";
           
    private String name ;
    
    private Integer incrementar;

    
    
    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
        System.out.println("Se creó el objeto indexController ");
        this.incrementar = 0;
    }

    public void eventoClick(){
        this.incrementar++;
        System.out.println("Incremento: " + this.incrementar);
    }
    
    
    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIncrementar() {
        return incrementar;
    }

    public void setIncrementar(Integer incrementar) {
        this.incrementar = incrementar;
    }
    
    
}
