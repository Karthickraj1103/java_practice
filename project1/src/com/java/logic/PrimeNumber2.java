package com.java.logic;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int n=73;
		int i;
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				break;
			}
		}
		if(i>n/2) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}
	}

}
