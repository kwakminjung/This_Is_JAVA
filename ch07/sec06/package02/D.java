package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class D extends A{
	// A() ������ ȣ��
	public D() {
		super();
	}
	//����� ���ؼ� protected�� �� AŬ������ �ʵ�� �޼ҵ� ��밡��
	public void method() {
		this.field = "value";
		this.method();
	}
	
	//���� ��ü �����ؼ� ����ϴ� ���� �Ұ����� (new�����ڷδ� �Ұ���)
//	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
//	}
}
