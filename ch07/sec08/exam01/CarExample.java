package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		//HankookTire���� �������̵��� roll()�޼ҵ尡 ȣ���
		myCar.tire = new HankookTire();
		myCar.run();
		//KumhoTire���� �������̵��� roll()�޼ҵ尡 ȣ���
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
