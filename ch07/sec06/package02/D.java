package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class D extends A{
	// A() 생성자 호출
	public D() {
		super();
	}
	//상속을 통해서 protected로 된 A클래스의 필드와 메소드 사용가능
	public void method() {
		this.field = "value";
		this.method();
	}
	
	//직접 객체 생성해서 사용하는 것은 불가능함 (new연산자로는 불가능)
//	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
//	}
}
