package ch07.sec06.package01;

public class B {
	public void method() {
		//protected�� ���� ��Ű���� �����Ƿ� ���� ����
		A a = new A();
		a.field = "value";
		a.method();
	}
}
