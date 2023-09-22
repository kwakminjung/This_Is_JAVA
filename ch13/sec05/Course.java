package ch13.sec05;

public class Course {
	//��� ��� ��� ����
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "��(��) Course1�� �����");
	}
	
	//Student(extends People), HightStudent(extends Student), MiddleStudent(extends Student) ��� ����
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "��(��) Course2�� �����");
	}
	
	//Worker(extends People), People ��� ����
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "��(��) Course3�� �����");
	}
	
	//Student(extends People), People ��� ����
	public static void registerCourse4(Applicant<? super Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "��(��) Course4�� �����");
	}
	
	/*
	 * ���׸�Ÿ��<? extends Ŭ����> -> Ŭ���� ���� ��Ӱ��� �Ʒ��θ�(�ڽİ���θ�) ��� �����ϵ��� ����
	 * ���׸�Ÿ��<? super Ŭ����> -> Ŭ���� ���� ��Ӱ��� ���θ�(�θ����θ�) ��� �����ϵ��� ����
	 * */
}
