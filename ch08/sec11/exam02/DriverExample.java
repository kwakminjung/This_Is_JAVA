package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입 (다형성 : 실행 결과가 다름)
		driver.driver(bus); //자동타입변환 -> 오버라이딩 메소드호출 -> 다형성
		driver.driver(taxi);
	}
}
