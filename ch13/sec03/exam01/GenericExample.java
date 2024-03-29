package ch13.sec03.exam01;

public class GenericExample {
	// 제네릭 메소드
	// 타입 파라미터 T 정의
	// public 타입 파라미터 정의] [리턴타입] [메소드명(매개변수, ... )] { ... }
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
