package ch07.sec11;

public final class Employee extends Person {
	//���ε� Ŭ���� Person�� �ڽ� Ŭ���� Employee
	//finalŰ����� �����Ͽ� �� �̻� ����� �� ������ ��Ÿ�� -> �ڽ� Ŭ���� �� ����
	
	@Override
	public void work() {
		System.out.println("��ǰ�� �����մϴ�.");
	}
}
