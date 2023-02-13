package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if (person instanceof Student) {
			//Student ��ü�� ��� ���� Ÿ�� ��ȯ
			Student student = (Student) person;
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		//Java 12 ���� ��밡��
		//person�� �����ϴ� ��ü�� Student Ÿ���� ���
		//student ������ ����(Ÿ�� ��ȯ �߻�)
		if(person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("��浿", 10);
		personInfo(p2);
	}
}
