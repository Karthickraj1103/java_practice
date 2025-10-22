package com.java.array;

public class ArrayReverse {

	public static void main(String[] args) {
		char[] c= {'g','f','e','d','c','b','a'};
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]+" ");
		}
	}

}
