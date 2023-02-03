package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자동 타입변화 - (2)
		Child child = new Child();
		//자동 타입변화 후에는 부모 클래스에 선언된 필드와 메소드로만
		//접근이 가능함
		Parent parent = child; 
		
		parent.method1(); //Parent-method1
		parent.method2(); //Child-method2 호출 (오버라이딩)
		//parent.method3(); 자식클래스 메소드라 호출 불가능
	}
}
