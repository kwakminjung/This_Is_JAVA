package ch09.sec03.exam01;

public class A {
	// ���� ��� Ŭ���� B�� AŬ���� ���ο��� ���Ǳ⵵ ������,
	// A Ŭ���� �ܺο��� A�� �Բ� ���Ǵ� ��찡 ���� ������ �ַ� default �Ǵ� public ���� ������ ����
	
	static class B {
		B(){
			System.out.println("B ������ ����");
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
