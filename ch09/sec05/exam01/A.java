package ch09.sec05.exam01;

/*
 * �ν��Ͻ� ��� Ŭ������ �ٱ� Ŭ������ ��� �ʵ�� �޼ҵ忡 ������ �����ϰ�,
 * ���� ��� Ŭ������ �ٱ� Ŭ������ ���� �ʵ�� ���� �޼ҵ忡 ������ �����ϴ�
 * */

public class A {
	int field1;
	void method1() {}

	static int field2;
	static void method2() {}
	
	// �ν��Ͻ� ��� Ŭ����
	class B {
		void method() {
			//A�� �ν��Ͻ� �ʵ�� �޼ҵ� �̿� ����
			field1 = 10;
			method1();
			
			//A�� ���� �ʵ�� �޼ҵ� �̿� ����
			field2 = 10;
			method2();
		}
	}
	
	// ���� ��� Ŭ����
	static class C {
		void method() {
			//A�� �ν��Ͻ� �ʵ�� �޼ҵ� �̿� �Ұ���
			// field1 = 10; //(x)
			// method1(); //(x)
			
			//A�� ���� �ʵ�� �޼ҵ� �̿� ����
			field2 = 10; //(o)
			method2(); //(o)
		}
	}
}
