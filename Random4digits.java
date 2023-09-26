package com.java.Normal;

import java.util.Random;

public class Random4digits {
	public static void main(String[] args) {
		int random = (int) (Math.random()*900)+1000;

		String output = String.valueOf(random);

		System.out.println(output);

	}
}
