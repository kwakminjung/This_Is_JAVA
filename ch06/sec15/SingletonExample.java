package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		/*Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();*/
		
		//���� �޼ҵ带 ȣ���ؼ� �̱��� ��ü ����
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//������ ��ü�� �����ϴ��� Ȯ��
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}