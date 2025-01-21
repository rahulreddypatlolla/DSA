package com.mru.oops;

public class Division extends Addition implements DivisionInterface {

	@Override
	public void div1() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 / num2;
		System.out.println(res);

	}

	@Override
	public void div2(int num1, int num2) {
		int res = num1 / num2;
		System.out.println(res);


	}

	@Override
	public int div3() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 / num2;
		System.out.println(res);
		return res;
	}

	@Override
	public int div4(int num1, int num2) {
		int res = num1 / num2;
		System.out.println(res);
		return res;
	}

}
