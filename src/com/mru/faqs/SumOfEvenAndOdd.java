package com.mru.faqs;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		int[] arr = {1,23,4,5,67,7,8};
		int evenSum = 0; 
        int oddSum = 0;  
        for (int num : arr) {
            if (num % 2 == 0) { 
                evenSum += num;
            } else { 
                oddSum += num;
            }
        }

        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);

	}

}
