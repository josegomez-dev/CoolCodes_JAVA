/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.beans;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alego
 */
@RequestScoped
@ManagedBean
public class PersonaBean {

    private String nombre;
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
        this.nombre = "";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public void transferir(){
        FacesContext context = FacesContext.getCurrentInstance();
        ResultadoBean rb = context.getApplication().evaluateExpressionGet(context, "#{resultadoBean}", ResultadoBean.class);
        rb.setResultado("Hola " + this.nombre);
    }
   
}
