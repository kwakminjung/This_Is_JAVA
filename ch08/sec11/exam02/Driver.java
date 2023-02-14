package ch08.sec11.exam02;

public class Driver {
	//선언 시에 매개변수를 인터페이스 타입으로 줘서
	//나중에 호출 시에 구현객체를 넣어 매개변수의 다형성을 구현함
	void driver(Vehicle vehicle) {
		vehicle.run();
	}
}
