package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		//HankookTire에서 오버라이딩한 roll()메소드가 호출됨
		myCar.tire = new HankookTire();
		myCar.run();
		//KumhoTire에서 오버라이딩한 roll()메소드가 호출됨
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
