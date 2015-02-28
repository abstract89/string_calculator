/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hd.stringcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Horváth Dániel
 */
public class StringCalculatorTest {
	
	private StringCalculator stringcalc = new StringCalculator();
	
	@Test
	public void addShouldReturn13() {
		assertEquals(13, stringcalc.add("2,4,7"));
	}
	
}
