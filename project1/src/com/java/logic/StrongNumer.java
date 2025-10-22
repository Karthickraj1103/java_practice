package com.java.logic;

import java.util.Scanner;

public class StrongNumer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		int result=0;
		int copy=n;
		
		while(copy!=0){
			int rem=copy%10;
			int fact=1;
			while(rem>0) {
				fact=fact*rem;
				rem--;
			}
			result=result+fact;
			copy=copy/10;
		}
		if(result==n) {
			System.out.println("given number is strong number");
		}
		else {
			System.out.println("given number is not strong number");
		}
	}

}
 