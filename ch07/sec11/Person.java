package ch07.sec11;

public sealed class Person permits Employee, Manager {
	//���ε� Ŭ���� (�ڽ�Ŭ������ ������ Ŭ������ Employee�� Manager�� ����)
	public String name;
	
	public void work() {
		System.out.println("�ϴ� ���� �������� �ʾҽ��ϴ�.");
	}
}
