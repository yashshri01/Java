package com.interfac;

public class Test implements Demo {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}
	
	public static void main(String[]args) {
		Test td = new Test();
		td.m1();
		td.m2();
	}
}
// 1) use abstract keyword => public abstract class Test implements Demo
// 2) implement method from Demo