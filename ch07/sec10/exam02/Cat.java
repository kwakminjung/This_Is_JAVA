package ch07.sec10.exam02;

public class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹"); //추상클래스 Animal의 sound메소드 재정의(오버라이드)
	}
}
