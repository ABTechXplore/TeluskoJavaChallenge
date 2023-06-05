package com.learn.demo;

//5!=5*4*3*2*1
//5!=5*4! |  4!=4*3!...... 
public class Facorial {
	public static void main(String[] args) {
		int num = 8;
		int result = 0;
		result = fact(num);
		System.out.println(result);
	}

	public static int fact(int num) {
		//recursion method
		  if (num == 1 || num == 0) 
			  return 1; 
		  return num * fact(num - 1);
		 
		
		//By iteration method
//		int value=1;
//		for(int i=1;i<=num;i++) {
//			value=value*i;
//		}
//		return value; 

	}

}
