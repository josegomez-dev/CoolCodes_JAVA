package com.cenfotec.stack.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cenfotec.stack.CenfoStack;
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
public class TestCenfoStack {
    
    public TestCenfoStack() {
    }
    
    @Test
    public void TestPush(){
        //assertEquals(1, 1);
        CenfoStack stack = new CenfoStack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }
    
    @Test
    public void TestPop(){
        //assertEquals(1, 1);
        CenfoStack stack = new CenfoStack();
        stack.push(1);
        stack.push(2);
        int atTop = stack.pop();
        assertEquals(1, stack.size());
        assertEquals(atTop, 2);
    }
    
    @Test
    public void TestTop(){
        //assertEquals(1, 1);
        CenfoStack stack = new CenfoStack();
        stack.push(1);
        stack.push(2);
        int atTop = stack.pop();
        assertEquals(1, stack.size());
        assertEquals(atTop, 2);
    }
    
    @Test
    public void TestSize1(){
        CenfoStack stack = new CenfoStack();
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(1);
        assertEquals(2, stack.size());
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
