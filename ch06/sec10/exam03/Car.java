package ch06.sec10.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		//���� �޼ҵ� ȣ�� (��ü ���� x)
		simulate();
		
		//��ü ����
		Car myCar = new Car();
		//�ν��Ͻ� ��� ��� (static�� �ƴϱ� ������ ��ü�� �����ؾ� ��)
		myCar.speed = 60;
		myCar.run();
	}
}
