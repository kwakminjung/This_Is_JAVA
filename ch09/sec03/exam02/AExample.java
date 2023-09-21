package ch09.sec03.exam02;

public class AExample {
	public static void main(String[] args) {
		A.B b = new A.B();
		
		System.out.println(b.field1); // 1
		b.method1();
		
		// °æ°í: The static field A.B.field2 should be accessed in a static way
		System.out.println(b.field2); // 2
		
		b.field2 ++;
		
		System.out.println(A.B.field2); // 3
		A.B.method2();
	}

}
