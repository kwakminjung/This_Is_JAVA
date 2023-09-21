package ch09.sec04.exam03;

public class A {
	/*
	 * 로컬 변수를 로컬 클래스에서 사용할 경우 로컬 변수는 final 특성을
	 * 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 됨
	 * 
	 */
	
	public void method1(int arg) {
		int var = 1;
		
		class B {
			void method2() {
				// 로컬 변수 읽기는 가능함
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
				// 로컬 변수 수정은 불가능함
				// 오류
//				arg = 2;
//				var = 2;
//				arg ++;
			}
		} // end of class B
		
		// 로컬 객체 생성
		B b = new B();
		// 로컬 객체 메소드 호출
		b.method2();
		
		// 로컬 변수 수정 불가능
		// 16, 17 번째 줄 오류 : Local variable arg defined in an enclosing scope must be final or effectively final
//		arg = 3;
//		var = 3;
		
	} // end of method1(int arg)
}
