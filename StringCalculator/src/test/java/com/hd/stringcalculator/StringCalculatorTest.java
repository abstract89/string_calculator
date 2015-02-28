/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hd.stringcalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Horváth Dániel
 */
public class StringCalculatorTest {

	private StringCalculator stringcalc = new StringCalculator();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void addShouldReturn13() throws Exception {
		assertEquals(13, stringcalc.add("2,4,7"));
	}

	@Test
	public void addShouldReturn6SomeSeparator() throws Exception {
		stringcalc.setSeparator(";");
		assertEquals(6, stringcalc.add("1;3;2"));

		stringcalc.setSeparator("\n");
		assertEquals(6, stringcalc.add("4\n1\n1"));

		stringcalc.setSeparator("\t");
		assertEquals(6, stringcalc.add("3\t1\t2"));
	}

	@Test
	public void addShouldReturn8IfMoreCharacterSeparator() throws Exception {
		stringcalc.setSeparator("||");
		assertEquals(8, stringcalc.add("2||4||2"));

		stringcalc.setSeparator("--");
		assertEquals(8, stringcalc.add("4--2--2"));
	}

	@Test
	public void addShouldReturnNegativeNumberExceptionMessage() throws NegativeNumberException {
		expectedException.expect(NegativeNumberException.class);
		expectedException.expectMessage("Negative not allowed: -4, -1");

		stringcalc.setSeparator("-");
		stringcalc.add("3--4-5--1-7");
	}
}
