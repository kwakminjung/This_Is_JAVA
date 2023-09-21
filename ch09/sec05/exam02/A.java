package ch09.sec05.exam02;

/*
 * �ٱ�Ŭ�����̸�.this => �ٱ���ü
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
			
			// A ��ü�� �ʵ�� �޼ҵ� ��� -> A��ü�� ���ο��� ������ A��ü�� �ǹ���
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


