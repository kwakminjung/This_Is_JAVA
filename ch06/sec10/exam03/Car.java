package ch06.sec10.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		Car myCar = new Car();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		//정적 메소드 호출 (객체 생성 x)
		simulate();
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용 (static이 아니기 때문에 객체를 생성해야 함)
		myCar.speed = 60;
		myCar.run();
	}
}
