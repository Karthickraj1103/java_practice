package com.java.logic;

public class PrimeNumber {
	public static void main(String[] args) {
		int start=1;
		int end=100;
		while(start<=end) {
			int n=start;
			int a=2;
			while(a<=n/2) {
				if(n%a==0) {
					break;
				}
				a++;
			}
			if(a>n/2) {
				System.out.println(start);
			}
			start++;
		}
	}
}
