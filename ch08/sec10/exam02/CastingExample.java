package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		//인터페이스 변수선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		
		//강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle; //인터페이스 -> 구현클래스 (강제타입변환:케스팅)
		bus.run();
		bus.checkFare(); //Vehicle인터페이스에는 없는 Bus의 메소드사용가능
	}
}
