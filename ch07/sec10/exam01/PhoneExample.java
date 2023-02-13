package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); Phone은 추상 클래스이므로 new연산자로 직접 객체생성 불가능함
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); //추상클래스 Phone의 메소드
		smartPhone.internetSerch(); //자식클래스 SmartPhone의 메소드
		smartPhone.turnOff(); //추상클래스 Phone의 메소드
	}
}
