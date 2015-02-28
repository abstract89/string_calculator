/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hd.stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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

		if (!numbers.matches("-?[0-9]+((" + Pattern.quote(separator) + ")-?[0-9]+)*(" + Pattern.quote(separator) + ")?")) {
			throw new IllegalArgumentException("Bad character(s) in input string: " + numbers);
		}
		
		List<String> numbersList = Arrays.asList(numbers.split("(?<!" + Pattern.quote(separator) + ")" + Pattern.quote(separator)));

		int sum = 0;
		for (String stringNumber : numbersList) {
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
