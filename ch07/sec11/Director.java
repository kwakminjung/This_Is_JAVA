package ch07.sec11;

public class Director extends Manager {
	//���ε� Ŭ���� Person�� �ڽ�Ŭ���� Manager�� ��ӹ��� Ŭ���� Director
	//Manager�� non-sealed�� ����� Ŭ�����̹Ƿ� ����� �����Ͽ� DirectorŬ������
	//������� �� ����
	@Override
	public void work() {
		System.out.println("��ǰ�� ��ȹ�մϴ�.");
	}
}
