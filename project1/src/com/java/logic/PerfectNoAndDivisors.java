package com.java.logic;

public class PerfectNoAndDivisors {

	public static void main(String[] args) {
		int n=28;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n==sum) {
			System.out.println("given number is perfect number");
		}
		else {
			System.out.println("given number is not perfect number");
		}
		//System.out.println(sum);
	}

}
