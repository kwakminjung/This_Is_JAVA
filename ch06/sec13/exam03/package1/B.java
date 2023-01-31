package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		//같은 패키지, 다른 클래스
		A a = new A();
		
		a.field1 = 1; //public 접근 가능
		a.field2 = 1; //default 접근 가능
		//a.field3 = 1; //private 접근 불가능
		
		a.method1(); //public 접근 가능
		a.method2(); //default 접근 가능
		//a.method3(); //private 접근 불가능
	} 
}
