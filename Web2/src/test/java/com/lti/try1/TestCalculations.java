package com.lti.try1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.try1.Calculations;

public class TestCalculations {

	@Test
    public void case1()
    {
       assertEquals(10, new Calculations().sum(5, 5));
    }
    @Test
    public void case2()
    {
    	assertEquals(0, new Calculations().diff(5, 5));
    }
    @Test
    public void case3()
    {
    	assertEquals(15, new Calculations().sum(10, 5));
    }

}
