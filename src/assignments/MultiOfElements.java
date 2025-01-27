package assignments;
import java.util.Arrays;

public class MultiOfElements {
	public static void main(String[] args) {
		int[] arr = {11, 23, 34, 56};
		int[] multiDigitsArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
            multiDigitsArr[i] = multiOfDigits(arr[i]);
        }
		System.out.println("Sum of digits for each element: " + Arrays.toString(multiDigitsArr));
	}
	
	public static int multiOfDigits(int num) {
        int product = 1;
        while (num != 0) {
            product *= num % 10;  
            num /= 10;        
        }
        return product;
    }


}
