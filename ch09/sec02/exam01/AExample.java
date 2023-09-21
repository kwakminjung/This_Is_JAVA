package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		A a = new A(); // 상단 B 객체 2개, A 객체 1
		// A 객체가 생성되면서 A 클래스 안의 B타입의 field가 생성됨
		// A 생성자 안에 있는 B 생성자가 실행됨 
		
		// A객체를 생성해야만 B를 생성할 수 있음
		A.B b = a.new B(); // 하단 B 객체 1
		
//		a.method(); // 하단 B 객체 2
//		a.field = b;
		
		// 출력 결과 (주석 지웠을 경우에)
		// B 객체 생성
		// B 객체 생성
		// A 객체 생성
		// B 객체 생성
		// B 객체 생성
	}
}
