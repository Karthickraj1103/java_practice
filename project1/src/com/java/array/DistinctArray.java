package com.java.array;

public class DistinctArray {
	public static void main(String[] args) {
		int[] n= {5,8,9,5,3,7,6,4,5,6,8};
		for(int i=0;i<n.length;i++) {
			boolean isDistinct=true;
			for(int j=0;j<n.length;j++) {
				if(i!=j&&n[i]==n[j]) {
					isDistinct=false;
				}
			}
			if(isDistinct==true) {
				System.out.println(n[i]);
			}
		}
	}
}