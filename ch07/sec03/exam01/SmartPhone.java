package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	public SmartPhone (String model, String color) {
		super(); // �θ�Ŭ���� Phone�� ��ü ����(�θ�Ŭ���� �⺻�������̹Ƿ� ��������)
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) ������ �����");
	}
}
