package ch09.sec02.exam01;

public class A {
	
	//��ø Ŭ���� - ��� Ŭ���� - �ν��Ͻ� ��� Ŭ���� :
	//A��ü�� �����ؾ߸� B��ü�� ������ �� ����
	
	// �ν��Ͻ� ��� Ŭ������ �ַ� A Ŭ���� ���ο��� ���ǹǷ� private ���� ������ ���� ���� �Ϲ�����
	// �ܺο��� ����Ϸ��� public�̳� default ���� ������ ��������
	
	class B {
		B(){
			System.out.println("B ��ü ����"); 
		}
	}
	
//	B field = new B(); // ��� B ��ü
	
	A(){
//		B b = new B(); // ��� B ��ü
		System.out.println("A ��ü ����"); // 2. A ��ü ����
	}
	
//	void method() {
//		B b = new B(); // �ϴ� B ��ü
//	}
}
