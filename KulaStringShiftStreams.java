package com.java8.Employee;
import java.util.Arrays;
import java.util.stream.Collectors;
public class KulaStringShiftStreams {

	    public static void main(String[] args) {
	        String input = "I@love&india";
	        String output = manipulateString(input);
	        System.out.println(output);
	    }

	    public static String manipulateString(String input) {
	        String result = Arrays.stream(input.split("[@&]"))
	                .map(String::toLowerCase)
	                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
	                    String thirdPart = list.get(2).substring(0, 1) + list.get(2).substring(1);
	                    return thirdPart + "@" + list.get(1) + "&" + list.get(0).toUpperCase();
	                }));

	        return result.length() != input.length() ? "Invalid input format!" : result;
	    }
	}


