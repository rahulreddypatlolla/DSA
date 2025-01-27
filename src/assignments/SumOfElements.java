package assignments;

import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int[] arr = {12, 34, 56, 78};
		int[] sumDigitsArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
            sumDigitsArr[i] = sumOfDigits(arr[i]);
        }
		System.out.println("Sum of digits for each element: " + Arrays.toString(sumDigitsArr));
	}
	
	public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  
            num /= 10;        
        }
        return sum;
}
}