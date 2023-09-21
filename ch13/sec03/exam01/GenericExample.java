package ch13.sec03.exam01;

public class GenericExample {
	// ���׸� �޼ҵ�
	// Ÿ�� �Ķ���� T ����
	// public Ÿ�� �Ķ���� ����] [����Ÿ��] [�޼ҵ��(�Ű�����, ... )] { ... }
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
