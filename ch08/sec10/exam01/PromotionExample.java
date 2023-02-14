package ch08.sec10.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		
		a = b; // B -> A : 자동 형변환 가능 (구현객체->인터페이스)
		a = c;
		a = d; // B를 상속받아서 자동 형변환 가능
		a = e;
	}
}
