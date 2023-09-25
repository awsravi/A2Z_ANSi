package com.sep.it;

import java.util.stream.Collectors;

public class VowelReplace {

	public static void main(String[] args) {
		String input = "hello world";
		String output = replaceVowels(input);
		System.out.println(output);
	}

	public static String replaceVowels(String s) {
		return s.chars().mapToObj(c -> {
			char ch = (char) c;
			if ("AEIOUaeiou".indexOf(ch) >= 0) {
				return 'o'; // Replace with 'o'
			} else {
				return ch;
			}
		}).map(Object::toString).collect(Collectors.joining(""));
	}
}
