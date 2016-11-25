package com.cenfotec.stack.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cenfotec.stack.EnteroCirc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alego
 */
public class TestEnteroCirc {
    
    
    public TestEnteroCirc() {
    }
    
    @Test
    public void init(){
        EnteroCirc ent = new EnteroCirc(12);
        assertEquals(0, ent.getValue());
    }
    
    @Test
    public void next(){
        EnteroCirc ent = new EnteroCirc(12);
        ent.next();
        assertEquals(1, ent.getValue());
    }
    
    @Test
    public void testRange(){
        EnteroCirc ent = new EnteroCirc(10, 2);
        for(int i = 0; i < 6; i++){
            ent.next();
        }
        assertEquals(2, ent.getValue());
    }
    
    @Test
    public void getValue(){
        EnteroCirc ent = new EnteroCirc(12);
        assertEquals(0, ent.getValue());
    }
        
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
