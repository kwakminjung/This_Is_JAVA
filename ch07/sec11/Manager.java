package ch07.sec11;

public non-sealed class Manager extends Person {
	//���ε� Ŭ���� Person�� �ڽ�Ŭ���� Manager
	//non-sealed�� �����Ͽ� ���� �������� �˸� -> �ڽ� Ŭ������ ���� �� ����
	@Override
	public void work() {
		System.out.println("���� ������ �մϴ�.");
	}
}
