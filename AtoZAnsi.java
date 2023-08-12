package com.j.java8;

import java.util.stream.IntStream;

public class AtoZAnsi {
	public static void main(String[] args) {
		char ch;
		int i;

		for (ch = 'A'; ch <= 'Z'; ch++) {
			i = ch;
			System.out.println(ch + " " + i);
		}
		
		//@awsravi
		IntStream.rangeClosed('a', 'z').mapToObj(l ->(char)l).forEach(ch1 -> System.out.println(ch1+" "+(int)ch1));

	}
}
