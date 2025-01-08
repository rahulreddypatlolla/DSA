package com.mru.logics;

public class ReverseString {

	public static void main(String[] args) {
String str = "MADAM";
		char[] arr = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		//Step1 Convert string to character array
		//char[] arr = str.toCharArray();
		 //swap
		int start = 0, end = arr.length-1;
		
		while(start<end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		//Convert CharArray to String
		String rev = new String(arr);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
