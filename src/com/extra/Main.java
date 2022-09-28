package com.extra;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Sequential/Normal Stream
		List<Integer> listOfNumbers1 = Arrays.asList(1, 2, 3, 4);
		listOfNumbers1.stream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);
		
		//Parallel Stream
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.parallelStream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);
		///The fork/join framework is an implementation of the
		//ExecutorService interface that helps you take advantage of multiple processors
	}

}
