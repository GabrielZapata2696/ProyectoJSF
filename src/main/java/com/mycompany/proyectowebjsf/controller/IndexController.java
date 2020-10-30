/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectowebjsf.controller;


import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.enterprise.context.ApplicationScoped;


/**
 *
 * @author Gabriel Zapata
 * @author Mary Zapata
 * @since 29/10/2020
 * @version 1.2.1
 */

//@ManagedBean(name = "indexController", eager = false )
//@RequestScoped
//@ApplicationScoped
//@SessionScoped
@Named(value = "indexController")
@ViewScoped

public class IndexController implements Serializable{
    
    private String titulo= "UNIVERSIDAD DE CUNDINAMARCA - Formulario";
           
    private String cedula = "";;
    private String nombre = "";
    private String apellido = "";
    private Date fechaNac = new Date(01/01/2020);
    
    private String nivelEstudio; 
    private String[] seleccionEstudio;
    
    private String[] idiomas;
    private String[] seleccionIdioma;
    
    private int numDiasT = 0;
    
    private double sueldoBase = 0.0;
    private long sueldoFinal = 0;
    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
        this.seleccionEstudio = new String[6];
        this.seleccionEstudio[0] = " Primaria";
        this.seleccionEstudio[1] = " Secundaria";
        this.seleccionEstudio[2] = " Tecnico";
        this.seleccionEstudio[3] = " Tecnologia";
        this.seleccionEstudio[4] = " Profesional";
        this.seleccionEstudio[5] = " Maestria";
                
        this.seleccionIdioma = new String[6];
        this.seleccionIdioma[0] = " Ingles";
        this.seleccionIdioma[1] = " Frances";
        this.seleccionIdioma[2] = " Japones";
        this.seleccionIdioma[3] = " Aleman";
        this.seleccionIdioma[4] = " Chino";
        this.seleccionIdioma[5] = " Ruso";
    }

    public void eventoClick(){       
        int valNumIdiomas = this.idiomas.length*10000;
        int valorNivel = 0;
        switch(this.nivelEstudio){
            case " Primaria":
                valorNivel = 0;
                break;
            case " Secundaria":
                valorNivel = 0;
                break;    
            case " Tecnico":
                valorNivel = 5000;
                break;
            case " Tecnologia":
                valorNivel = 15000;
                break;
            case " Profesional":
                valorNivel = 30000;
                break;    
            case " Maestria":
                valorNivel = 40000;
                break;                                    
        }
        this.sueldoFinal = (long)((this.sueldoBase*this.numDiasT)+valorNivel+valNumIdiomas);
        this.impresiones();
  
    }
    
    public void impresiones(){
        
        System.out.println("C.C.: " + this.cedula);
        System.out.println("Nombre Completo: " + this.nombre + " " + this.apellido);
        System.out.println("Fecha de nacimiento: " + this.fechaNac);
        System.out.println("# Dias Trabajados: " + this.numDiasT);                
        System.out.println("Sueldo Final: $ " + this.sueldoFinal);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public int getNumDiasT() {
        return numDiasT;
    }

    public void setNumDiasT(int numDiasT) {
        this.numDiasT = numDiasT;
    }

    public String[] getSeleccionIdioma() {
        return seleccionIdioma;
    }

    public void setSeleccionIdioma(String[] seleccionIdioma) {
        this.seleccionIdioma = seleccionIdioma;
    }

    public String[] getSeleccionEstudio() {
        return seleccionEstudio;
    }

    public void setSeleccionEstudio(String[] seleccionEstudio) {
        this.seleccionEstudio = seleccionEstudio;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }


    
    
    
    
}
