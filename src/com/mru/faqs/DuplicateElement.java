package com.mru.faqs;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		int [] arr = {1,2,3,1,4,1};
		HashSet<Integer> set = new HashSet<>();
		for(int element : arr) {
			if(set.contains(element)) {
				System.out.println("Duplicates available....");
				break;
			}else {
				System.out.println("No Duplicates.....");
			}
			set.add(element);
		}
	}

}
