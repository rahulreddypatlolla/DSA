package com.mru.faqs;
import java.util.Scanner;
public class CheckEvenOrOdd {

	public static void main(String[] args) {
		//scanner is used to read data dynamically
		//scanner is predefined class
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even !!!");
		}else {
				System.out.println("Odd1 !!!");
		}

	}

}
