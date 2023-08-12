package com.j.java8;

import java.util.stream.IntStream;

public class AtoZAlpha {
	public static void main(String[] args) {

		IntStream.rangeClosed('A', 'Z').mapToObj(letter -> (char) letter).forEach(System.out::println);
		
		IntStream.rangeClosed('a', 'z').mapToObj(l-> (char)l).forEach(System.out::print);
		
		IntStream.rangeClosed(1, 8).mapToObj(l ->(int)l).forEach(System.out::println);
	}
}
