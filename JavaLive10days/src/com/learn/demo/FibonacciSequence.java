package com.learn.demo;

import java.util.HashMap;
import java.util.Map;

//0	1	1	2	3	5	8	13	21	34...........
//fib(9)=fib(7)+fib(8);
public class FibonacciSequence {
	private static Map<Integer, Integer> cache= new HashMap<Integer, Integer>();
	public static void main(String args[]) {	
		int pos = 10;
		int result = fib(pos);
		System.out.println(result);
	}

	public static int fib(int pos) {
		/*
		 * int a = 0; int b = 1; int c = 0; for (int i = 2; i <= pos; i++) { c = a + b;
		 * a = b; b = c; }
		 */
		//Recursion  | doing the same num repeatedly  --> memonization 
		if (pos == 0)
			return 0;
		if (pos == 1 || pos == 2)
			return 1;
		if (cache.containsKey(pos))
			return cache.get(pos);
		
		int result = fib(pos - 1) + fib(pos - 2);
		cache.put(pos,result);
		return result;	
	}

}
