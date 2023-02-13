package ch08.sec02;

public class Television implements RemoteControl {
	//인터페이스 RemoteControl에 선언된 turnOn 추상메소드 재정의(오버라이드)
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
}
