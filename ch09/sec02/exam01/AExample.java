package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		A a = new A(); // ��� B ��ü 2��, A ��ü 1
		// A ��ü�� �����Ǹ鼭 A Ŭ���� ���� BŸ���� field�� ������
		// A ������ �ȿ� �ִ� B �����ڰ� ����� 
		
		// A��ü�� �����ؾ߸� B�� ������ �� ����
		A.B b = a.new B(); // �ϴ� B ��ü 1
		
//		a.method(); // �ϴ� B ��ü 2
//		a.field = b;
		
		// ��� ��� (�ּ� ������ ��쿡)
		// B ��ü ����
		// B ��ü ����
		// A ��ü ����
		// B ��ü ����
		// B ��ü ����
	}
}
