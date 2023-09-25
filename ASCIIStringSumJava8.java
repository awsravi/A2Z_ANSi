package com.sep.it;

import java.util.Arrays;

public class ASCIIStringSumJava8 {
	public static void main(String[] args) {
		String input = "123ABC,456DEF";

		// 123ABC=348 456DEF=366 348-366=-18

		String[] parts = input.split(",");
		String firstString = parts[0];
		String secondString = parts[1];

		int difference = calculateASCIISum(firstString) - calculateASCIISum(secondString);

		System.out.println("The difference is: " + difference);
	}

	public static int calculateASCIISum(String input) {
		return input.chars().mapToObj(ch -> (char) ch)
				.mapToInt(Character::getNumericValue)
				.filter(value -> value >= 0)
				.sum();
	}
}
