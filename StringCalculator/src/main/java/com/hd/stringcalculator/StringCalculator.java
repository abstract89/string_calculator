/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hd.stringcalculator;

/**
 *
 * @author Horváth Dániel
 */
public class StringCalculator {

	private final static String DEFAULT_SEPARATOR = ",";
	private String separator;

	public StringCalculator() {
		this(DEFAULT_SEPARATOR);
	}

	public StringCalculator(String separator) {
		this.separator = separator;
	}

	public int add(String numbers) {
		if (numbers == null) {
			throw new NullPointerException();
		} else if (numbers.isEmpty()) {
			return 0;
		}

		String[] numbersArray = numbers.split(separator);

		int sum = 0;
		for (String stringNumber : numbersArray) {
			sum += Integer.valueOf(stringNumber);
		}

		return sum;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}
}
