package ch06.sec13.exam03.package1;

public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1; //public ���� ����
		field2 = 1; //default ���� ����
		field3 = 1; //private ���� ����
		
		method1(); //public ���� ����
		method2(); //default ���� ����
		method3(); //private ���� ����
	}
	//public �޼ҵ�
	public void method1() {	
	}
	//default �޼ҵ�
	void method2() {
	}
	//private �޼ҵ�
	private void method3() {
	}
	
}
