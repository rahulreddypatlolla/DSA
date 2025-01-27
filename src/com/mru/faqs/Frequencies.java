package com.mru.faqs;

import java.util.HashMap;

public class Frequencies {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,3,4,2,3,4,3,4,4};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int ele : arr) {
			map.put(ele,map.getOrDefault(ele, 0) +  1);
		}
		for(HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"frequency: "+entry.getValue());
		}

	}

}
