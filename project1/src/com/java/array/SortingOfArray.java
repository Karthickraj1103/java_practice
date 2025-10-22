package com.java.array;
import java.util.Scanner;
public class SortingOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Scannerimplementation
		System.out.println("enter the size of an array element ");
		int size=sc.nextInt();
		
		int[] n=new int[size];
		//array inplementtation
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
		}
		
		//ascending
		System.out.println("ascending");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(n[i]>n[j]) {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.print(n[i]+"\t");
		}
		
		//descending
		
		System.out.println("Descending");
		
				for(int i=0;i<size;i++) {
					for(int j=i+1;j<size;j++) {
						if(n[i]<n[j]) {
							int temp=n[i];
							n[i]=n[j];
							n[j]=temp;
						}
					}
					System.out.print(n[i]+"\t");
				}
	}
}
