package com.mru.methods;

public class Methods {

	public static void main(String[] args) {
		//Methods obj = new Methods();
		// static method
		MRU obj = new MRU();

		/*
		 * obj.dsa1(); obj.dsa2("Nine"); String res = obj.dsa3();
		 * System.out.println(res); int res1 = obj.dsa4(69); System.out.println(res1);
		 */
		// static method

		
		  MRU.dsa1();
		  MRU.dsa2("Nine");
		  String res = MRU.dsa3();
		  System.out.println(res);
		  int res1 = MRU.dsa4(69);
		  System.out.println(res1);
		 

	}

}