package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		//���� ��Ű��, �ٸ� Ŭ����
		A a = new A();
		
		a.field1 = 1; //public ���� ����
		a.field2 = 1; //default ���� ����
		//a.field3 = 1; //private ���� �Ұ���
		
		a.method1(); //public ���� ����
		a.method2(); //default ���� ����
		//a.method3(); //private ���� �Ұ���
	} 
}
