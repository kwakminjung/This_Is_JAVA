package ch09.sec03.exam01;

public class A {
	// 정적 멤버 클래스 B는 A클래스 내부에서 사용되기도 하지만,
	// A 클래스 외부에서 A와 함께 사용되는 경우가 많기 때문에 주로 default 또는 public 접근 제한을 가짐
	
	static class B {
		B(){
			System.out.println("B 생성자 실행");
		}
	}
	
	B field1 = new B();
	
	static B field2 = new B();
	
	A(){
		B b = new B();
	}
	
	void method1() {
		B b = new B();
	}
	
	static void method2() {
		B b = new B();
	}
}
