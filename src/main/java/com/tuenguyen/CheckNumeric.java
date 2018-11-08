package com.tuenguyen;

import org.apache.commons.lang3.StringUtils;

public class CheckNumeric {
	public static void main(String[] args) {
		String text1 = "1234";
		String text2 = "29349T";
		
		boolean result1 = StringUtils.isNumeric(text1);
		boolean result2 = StringUtils.isNumeric(text2);
		
		System.out.println(text1 + " is numeric " + result1);
		System.out.println(text2 + " is numeric " + result2);
	}
}
