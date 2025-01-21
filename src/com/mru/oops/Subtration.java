package com.mru.oops;

public class Subtration extends Addition implements SubtractionInterface {

	@Override
	public void sub1() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 - num2;
		System.out.println(res);

	}

	@Override
	public void sub2(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);

	}

	@Override
	public int sub3() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 - num2;
		System.out.println(res);
		return res;
	}

	@Override
	public int sub4(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
		return res;
	}

}
