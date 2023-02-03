package ch07.sec07.exam01;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동 타입 변환(상속관계에 있음)
		// 부모타입 변수 = 자식타입객체;
		// A a1 = new B(); 로도 가능
		// a1과 b는 같은 객체를 참조함 (a1 == b) -> true
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 컴파일에러 (상속관계에 있지 않음)
		//B b3 = e;
		//C c2 = d;
	}
}
