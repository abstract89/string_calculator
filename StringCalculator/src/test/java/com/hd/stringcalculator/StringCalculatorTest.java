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

	@Test
	public void addShouldReturn6SomeSeparator() {
		stringcalc.setSeparator(";");
		assertEquals(6, stringcalc.add("1;3;2"));

		stringcalc.setSeparator("\n");
		assertEquals(6, stringcalc.add("4\n1\n1"));
		
		stringcalc.setSeparator("\t");
		assertEquals(6, stringcalc.add("3\t1\t2"));
	}
	
	@Test
	public void addShouldReturn8IfMoreCharacterSeparator() {
		stringcalc.setSeparator("||");
		assertEquals(8, stringcalc.add("2||4||2"));
		
		stringcalc.setSeparator("--");
		assertEquals(8, stringcalc.add("4--2--2"));
	}
}
