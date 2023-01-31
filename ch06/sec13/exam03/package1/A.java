package ch06.sec13.exam03.package1;

public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1; //public 접근 가능
		field2 = 1; //default 접근 가능
		field3 = 1; //private 접근 가능
		
		method1(); //public 접근 가능
		method2(); //default 접근 가능
		method3(); //private 접근 가능
	}
	//public 메소드
	public void method1() {	
	}
	//default 메소드
	void method2() {
	}
	//private 메소드
	private void method3() {
	}
	
}
