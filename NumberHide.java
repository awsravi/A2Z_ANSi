package com.java.Normal;

public class NumberHide {
public static void main(String[] args) {
	
	String s="0000003761";
	
	String output=s.replaceAll(".(?=.{4})", "#");
	System.out.println(output);
	
	
}
}
