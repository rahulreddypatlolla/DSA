package com.mru.loops;

public class Loops {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int e1 = arr1[0];
		int e2 = arr1[1];
		int e3 = arr1[2];
		int e4 = arr1[3];
		int e5 = arr1[4];
		System.out.println("Elements in Array :");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
//find the number of elements
		int n = arr1.length;
		System.out.println("Number of elements in Array : "+n);
		
// for loop
		System.out.println("For loop :");
		for(int i=0;i<n;i++) {			
			System.out.println(arr1[i]);
		}
// While loop
		System.out.println("While loop :");
		int x = 0;
		while(x<n) {		
			System.out.println(arr1[x]);
			x++;
		}
// Do while loop
		System.out.println("Do While loop :");
		int y = 0;
		do {
			System.out.println(arr1[y]);
			y++;
			
		}while(y<n);
//For Each loop
		System.out.println("Foreach loop :");
		for(int element:arr1) {
			System.out.println(element);
		}
	}

}