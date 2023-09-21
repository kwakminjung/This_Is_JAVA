package ch09.sec02.exam02;

public class A {
	// 인스턴스 멤버 클래스 B
	class B {
		// 인스턴스 필드
		int field1 = 1;
		
		// 정적 필드 (Java 17부터 허용)
		static int field2 = 2;
		
		B(){
			System.out.println("B-생성자 실행");
		}
		
		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		// 정적 메소드
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}
	
	// 인스턴스 메소드
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		// The static field A.B.field2 should be accessed in a static way
		// 문구가 뜨지만 실행은 됨
		System.out.println(b.field2); 
		b.method2();
		
		// 정적 필드와 메소드는 B객체를 만들지 않아도 사용가능함
		System.out.println(B.field2);
		B.method2();
		
		// 에러
//		System.out.println(B.field1);
//		B.method1();
	}
}
