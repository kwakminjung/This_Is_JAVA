package ch06.sec06.exam02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		//필드는 객체 내부의 생성자와 메소드 내부에서 사용할 수 있고, 
		//객체 외부에서도 접근해서 사용할 수 있다.
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}
