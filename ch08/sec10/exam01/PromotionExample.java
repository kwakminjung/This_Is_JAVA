package ch08.sec10.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		
		a = b; // B -> A : �ڵ� ����ȯ ���� (������ü->�������̽�)
		a = c;
		a = d; // B�� ��ӹ޾Ƽ� �ڵ� ����ȯ ����
		a = e;
	}
}