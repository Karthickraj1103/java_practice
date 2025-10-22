package com.java.pattern;

public class NumericPattern {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*n=5,i=1,1<=5;j=1;1<=1;1;j++=2;2<=1fail
 * 
 * 
 * 
 * 
 * 
 * 
 */
