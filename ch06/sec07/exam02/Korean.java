package ch06.sec07.exam02;

public class Korean {
	//�ʵ� ����
	String nation = "���ѹα�";
	String name;
	String ssn;
	//������ ����
	public Korean(String name, String ssn) {
		//�������� ���� �ʵ��� �Ű��������� �����ϰ� ��
		//-> �ʵ�� �Ű������� �̸��� �����Ƿ� thisŰ���� �����
		//��Ŭ�������� �ʵ�� �Ķ���, �Ű������� ������
		this.name = name;
		this.ssn = ssn;
	}
}
