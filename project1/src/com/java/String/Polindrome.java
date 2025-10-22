package com.java.String;

public class Polindrome {
	public static void main(String[] args) {
		String str="malayalam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("given string is polindrome");
		}
		else {
			System.out.println("given string is not polindrome");
		}
	}
}
