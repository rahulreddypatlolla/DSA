package com.mru.oops;

public class Multiplication extends Addition implements MultiplicationInterface {

	@Override
	public void mul1() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 * num2;
		System.out.println(res);

	}

	@Override
	public void mul2(int num1, int num2) {
		int res = num1 * num2;
		System.out.println(res);

	}

	@Override
	public int mul3() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 * num2;
		System.out.println(res);
		return res;
	}

	@Override
	public int mul4(int num1, int num2) {
		int res = num1 * num2;
		System.out.println(res);
		return res;
	}

}
