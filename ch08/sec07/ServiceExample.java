package ch08.sec07;

public class ServiceExample {
	public static void main(String[] args) {
		//�������̽� ���� ����� ���� ��ü ����
		Service service = new ServiceImpl();
		
		//����Ʈ �޼ҵ� ȣ�� (������ü�� �ʿ���)
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		//���� �޼ҵ� ȣ�� (������ü�� �ʿ����)
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}
}
