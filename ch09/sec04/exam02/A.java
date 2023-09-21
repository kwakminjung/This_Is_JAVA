package ch09.sec04.exam02;

public class A {
	void useB() {
		
		class B {
			int field1 = 1;
			
			static int field2 = 2;
			
			B() {
				System.out.println("B-积己磊 角青");
			}
			
			void method1() {
				System.out.println("B-method1 角青");
			}
			
			static void method2() {
				System.out.println("B-method2 角青");
			}
		} // end of class B
		
		B b = new B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
		
	} // end of useB()

}
