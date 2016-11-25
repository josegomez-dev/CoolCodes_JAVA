/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.astrofreakazoid.beans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author alego
 */
@ManagedBean
public class IndexBean {

    private String name;
    private String mail;
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
