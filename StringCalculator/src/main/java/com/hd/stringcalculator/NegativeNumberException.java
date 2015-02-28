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
public class NegativeNumberException extends Exception {

	private final static String DEFAULT_MESSAGE = "Negative not allowed"; 
	
	public NegativeNumberException() {
		super(DEFAULT_MESSAGE);
	}

	public NegativeNumberException(String message) {
		super(DEFAULT_MESSAGE + ": " + message);
	}
}
