package ch07.sec03.exam02;

public class Phone {
	public String model;
	public String color;
	//매개변수가 있는 부모클래스의 생성자
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}
}
