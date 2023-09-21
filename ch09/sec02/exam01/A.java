package ch09.sec02.exam01;

public class A {
	
	//중첩 클래스 - 멤버 클래스 - 인스턴스 멤버 클래스 :
	//A객체를 생성해야만 B객체를 생성할 수 있음
	
	// 인스턴스 멤버 클래스는 주로 A 클래스 내부에서 사용되므로 private 접근 제한을 갖는 것이 일반적임
	// 외부에서 사용하려면 public이나 default 접근 제한을 가져야함
	
	class B {
		B(){
			System.out.println("B 객체 생성"); 
		}
	}
	
//	B field = new B(); // 상단 B 객체
	
	A(){
//		B b = new B(); // 상단 B 객체
		System.out.println("A 객체 생성"); // 2. A 객체 생성
	}
	
//	void method() {
//		B b = new B(); // 하단 B 객체
//	}
}
