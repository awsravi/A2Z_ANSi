package com.sep.it;

import java.util.Scanner;
public class ASCIIStringSum {
    public static void main(String[] args) {
        String input = "123ABC,456DEF";
        
        //123ABC=348 456DEF=366 348-366=-18
        
        String[] parts = input.split(",");
        String firstString = parts[0];
        String secondString = parts[1];

        int sumFirstString = calculateASCIISum(firstString);
        int sumSecondString = calculateASCIISum(secondString);

        int difference = sumFirstString - sumSecondString;

        System.out.println("The difference is: " + difference);
    }

    public static int calculateASCIISum(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            sum += (int) c;
        }
        return sum;
    }
}
