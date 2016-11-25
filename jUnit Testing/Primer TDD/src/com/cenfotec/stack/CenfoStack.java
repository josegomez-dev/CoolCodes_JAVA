/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cenfotec.stack;

import java.util.ArrayList;

/**
 *
 * @author alego
 */
public class CenfoStack {

    private final int MIN_INDEX = -1;
    
    private ArrayList storage = new ArrayList();
    private int topPosition = MIN_INDEX;
    
    public void push(int i) {
        storage.add(i);
        topPosition++;
    }

    public int pop() {
        int topValue = (Integer) storage.get(topPosition);
        storage.remove(topPosition--);
        return topValue;
    }
    
    public int top(){
        return 0;
    }

    public Object size() {
        return storage.size();
    }
    
}
