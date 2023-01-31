package ch06.sec13.exam01.package2;

import ch06.sec13.exam01.package1.*;

public class C {
	//A a; A클래스 접근 불가 -> default 접근 제한
	B b; //B클래스 접근 가능 -> public 접근 제한 이므로 다른 패키지에서 접근 가능
}
