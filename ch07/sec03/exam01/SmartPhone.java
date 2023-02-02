package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	public SmartPhone (String model, String color) {
		super(); // 부모클래스 Phone의 객체 생성(부모클래스 기본생성자이므로 생략가능)
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
