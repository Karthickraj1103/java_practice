package com.java.String;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Peek";
		String s2="Keep";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("given strings are not Anagram");
		}
		else {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			
			Arrays.sort(c1);;
			Arrays.sort(c2);;
			
			if(Arrays.equals(c1,c2)==true) {
				System.out.println("given strings are anagram");
			}
			else {
				System.out.println("given strings are not anagram");
			}

		}
	}
}
