package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		//�������̽� ��������� ���� ��ü ����
		Vehicle vehicle = new Bus();
		
		//�������̽��� ���ؼ� ȣ��
		vehicle.run();
		
		//���� Ÿ�� ��ȯ �� ȣ��
		Bus bus = (Bus) vehicle; //�������̽� -> ����Ŭ���� (����Ÿ�Ժ�ȯ:�ɽ���)
		bus.run();
		bus.checkFare(); //Vehicle�������̽����� ���� Bus�� �޼ҵ��밡��
	}
}
