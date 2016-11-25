/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.stack;

/**
 *
 * @author alego
 */
public class EnteroCirc {

    private int limit;
    private int jump;
    
    private int value;
    
    public EnteroCirc(int limit) {
        this.value = 0;
        this.limit = limit;
        this.jump = 1;
    }
    
    public EnteroCirc(int limit, int jump) {
        this.value = 0;
        this.limit = limit;
        this.jump = jump;
    }

    public void next() {
        if(this.value + jump <= limit){
            this.value = this.value + jump;
        }else{
            this.value = (this.value + jump) - limit;
        }
    }

    public Object getValue() {
        return this.value;
    }
    
}
