package com.mru.oops;

public class Oops1 {

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.m1();
		obj.m2("OOPS");
		String res1 = obj.m3();
		System.out.println(res1);
		String res2 = obj.m4("OOPS4");
		System.out.println(res2);
	}

}
