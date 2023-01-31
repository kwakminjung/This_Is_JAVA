package ch06.sec13.exam02.package1; //동일 패키지

public class B {
	A a1 = new A(true); // public 접근 가능
	A a2 = new A(1); // default 접근 가능
	//A a3 = new A("문자열"); //private 접근 불가능
}
