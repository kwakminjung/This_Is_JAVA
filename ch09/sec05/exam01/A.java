package ch09.sec05.exam01;

/*
 * 인스턴스 멤버 클래스는 바깥 클래스의 모든 필드와 메소드에 접근이 가능하고,
 * 정적 멤버 클래스는 바깥 클래스의 정적 필드와 정적 메소드에 접근이 가능하다
 * */

public class A {
	int field1;
	void method1() {}

	static int field2;
	static void method2() {}
	
	// 인스턴스 멤버 클래스
	class B {
		void method() {
			//A의 인스턴스 필드와 메소드 이용 가능
			field1 = 10;
			method1();
			
			//A의 정적 필드와 메소드 이용 가능
			field2 = 10;
			method2();
		}
	}
	
	// 정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 이용 불가능
			// field1 = 10; //(x)
			// method1(); //(x)
			
			//A의 정적 필드와 메소드 이용 가능
			field2 = 10; //(o)
			method2(); //(o)
		}
	}
}
