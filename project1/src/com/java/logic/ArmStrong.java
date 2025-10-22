package com.java.logic;

public class ArmStrong {
	public static void main(String[] args) {
		int n=153;
		int n1=n;
		int count=0;
		
		while(n1!=0) {
			count++;
			n1=n1/10;
		}
		int base=n;
		int sum=0;
		while(base!=0) {
			int rem=base%10;
			int result=1;
			int power=count;
			while(power>0) {
				result=result*rem;
				power--;
			}
			base=base/10;
			sum=sum+result;
		}
		if(sum==n) {
			System.out.println("given no is armstrong");
		}
		else {
			System.out.println("given no is not armstrong");
		}
	}
}
