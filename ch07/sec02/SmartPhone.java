package ch07.sec02;

public class SmartPhone extends Phone {
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model; // ��ӹ��� �ʵ�
		this.color = color; // ��ӹ��� �ʵ�
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}
}
