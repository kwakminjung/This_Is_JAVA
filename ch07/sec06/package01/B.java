package ch07.sec06.package01;

public class B {
	public void method() {
		//protected와 같은 패키지에 있으므로 접근 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
