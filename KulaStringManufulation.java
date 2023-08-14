package com.String.p;
import java.util.Arrays;
import java.util.stream.Collectors;
public class KulaStringManufulation {
	
	    public static void main(String[] args) {
	        String input = "I@love&india";
	        String output = manipulateString(input);
	        System.out.println(output);
	    }

	    public static String manipulateString(String input) {
	        String[] parts = input.split("[@&]");
	        
	        if (parts.length != 3) {
	            return "Invalid input format!";
	        }

	        String firstPart = parts[0];
	        String secondPart = parts[1];
	        String thirdPart = parts[2];

	        return thirdPart + "@" + secondPart + "&" + firstPart;
	    }
	}


