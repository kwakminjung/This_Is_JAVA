package ch09.sec04.exam03;

public class A {
	/*
	 * ���� ������ ���� Ŭ�������� ����� ��� ���� ������ final Ư����
	 * ���� �ǹǷ� ���� ���� ���� �ְ� ������ �� ���� ��
	 * 
	 */
	
	public void method1(int arg) {
		int var = 1;
		
		class B {
			void method2() {
				// ���� ���� �б�� ������
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
				// ���� ���� ������ �Ұ�����
				// ����
//				arg = 2;
//				var = 2;
//				arg ++;
			}
		} // end of class B
		
		// ���� ��ü ����
		B b = new B();
		// ���� ��ü �޼ҵ� ȣ��
		b.method2();
		
		// ���� ���� ���� �Ұ���
		// 16, 17 ��° �� ���� : Local variable arg defined in an enclosing scope must be final or effectively final
//		arg = 3;
//		var = 3;
		
	} // end of method1(int arg)
}
