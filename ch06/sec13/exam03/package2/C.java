package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1; //public ���� ����
		//a.field2 = 1; //default ���� �Ұ���
		//a.field3 = 1; //private ���� �Ұ���
		
		a.method1(); //public ���� ����
		//a.method2(); //default ���� �Ұ���
		//a.method3(); //private ���� �Ұ���
	}
}
