/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hd.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Horváth Dániel
 */
public class StringListFilter {

	private String pattern;

	public StringListFilter(String pattern) {
		this.pattern = pattern;
	}

	public List<String> filter(List<String> list) {
		List<String> selectionList = new ArrayList<>();
		Pattern p = Pattern.compile(pattern);
		for (String item : list) {
			if (p.matcher(item).matches()) {
				selectionList.add(item);
			}
		}
		return selectionList;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
