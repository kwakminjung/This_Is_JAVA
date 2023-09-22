package ch13.sec05;

public class Course {
	//모든 사람 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
	//Student(extends People), HightStudent(extends Student), MiddleStudent(extends Student) 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
	}
	
	//Worker(extends People), People 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
	
	//Student(extends People), People 등록 가능
	public static void registerCourse4(Applicant<? super Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course4을 등록함");
	}
	
	/*
	 * 제네릭타입<? extends 클래스> -> 클래스 포함 상속관계 아래로만(자식관계로만) 사용 가능하도록 제한
	 * 제네릭타입<? super 클래스> -> 클래스 포함 상속관계 위로만(부모관계로만) 사용 가능하도록 제한
	 * */
}
