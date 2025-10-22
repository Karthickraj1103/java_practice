package com.java.array;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int[] n= {10,22,21,1,34,94};
		int max =n[0];
		int min=n[0];
		for(int i=0;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
		}
		for(int i=n.length-1;i>=0;i--) {
			if(min>n[i]) {
				min=n[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}
}
