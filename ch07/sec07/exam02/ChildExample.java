package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//�ڵ� Ÿ�Ժ�ȭ - (2)
		Child child = new Child();
		//�ڵ� Ÿ�Ժ�ȭ �Ŀ��� �θ� Ŭ������ ����� �ʵ�� �޼ҵ�θ�
		//������ ������
		Parent parent = child; 
		
		parent.method1(); //Parent-method1
		parent.method2(); //Child-method2 ȣ�� (�������̵�)
		//parent.method3(); �ڽ�Ŭ���� �޼ҵ�� ȣ�� �Ұ���
	}
}
