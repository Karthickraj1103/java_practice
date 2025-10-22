package com.java.logic;

public class fibonacci {
	public static void main(String[] args) {
		int n=0;
		int fib=0;
		int fib1=1;
		int fib2=fib+fib1;
		
		while(n<10) {
			System.out.println(fib);
			fib=fib1;
			fib1=fib2;
			fib2=fib+fib1;
			n++; 
		}
		
	}
}