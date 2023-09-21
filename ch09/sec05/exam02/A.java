package ch09.sec05.exam02;

/*
 * 바깥클래스이름.this => 바깥객체
 * */

public class A {
	String field = "A-field";
	int check = 0;
	
	public A(int check) {
		this.check = check;
	}
	
	void method() {
		System.out.println("A-method");
	}
	
	class B {
		String field = "B-field";
		
		void method() {
			System.out.println("B-methdo");
		}
		
		void print() {
			System.out.println(this.field); // B-field
			this.method(); // B-method
			
			// A 객체의 필드와 메소드 사용 -> A객체는 메인에서 생성된 A객체를 의미함
			System.out.println(A.this.field); // A-field
			A.this.method(); // A-method
			System.out.println(A.this.check);
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
}


