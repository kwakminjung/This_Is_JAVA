package ch09.sec02.exam02;

public class A {
	// �ν��Ͻ� ��� Ŭ���� B
	class B {
		// �ν��Ͻ� �ʵ�
		int field1 = 1;
		
		// ���� �ʵ� (Java 17���� ���)
		static int field2 = 2;
		
		B(){
			System.out.println("B-������ ����");
		}
		
		// �ν��Ͻ� �޼ҵ�
		void method1() {
			System.out.println("B-method1 ����");
		}
		
		// ���� �޼ҵ�
		static void method2() {
			System.out.println("B-method2 ����");
		}
	}
	
	// �ν��Ͻ� �޼ҵ�
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		// The static field A.B.field2 should be accessed in a static way
		// ������ ������ ������ ��
		System.out.println(b.field2); 
		b.method2();
		
		// ���� �ʵ�� �޼ҵ�� B��ü�� ������ �ʾƵ� ��밡����
		System.out.println(B.field2);
		B.method2();
		
		// ����
//		System.out.println(B.field1);
//		B.method1();
	}
}
