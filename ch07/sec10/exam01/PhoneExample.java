package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); Phone�� �߻� Ŭ�����̹Ƿ� new�����ڷ� ���� ��ü���� �Ұ�����
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn(); //�߻�Ŭ���� Phone�� �޼ҵ�
		smartPhone.internetSerch(); //�ڽ�Ŭ���� SmartPhone�� �޼ҵ�
		smartPhone.turnOff(); //�߻�Ŭ���� Phone�� �޼ҵ�
	}
}
