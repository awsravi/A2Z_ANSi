package com.java.Normal;

public class ReplaceSplChar {
	public static void main(String[] args) {

		String s = "@!#$&^!sunita";

		String output = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(output);
	}
}
