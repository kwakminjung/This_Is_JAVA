package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//final �޼ҵ�� �������̵��� �� �� ����
	
//	@Override
//	public void stop() {
//		System.out.println("������ī�� ����");
//		speed = 0;
//	}
}
