package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	/*
	 * 타입 파라미터는 기본적으로 Object 타입으로 간주되므로 Object가 가지고 있는 메소드를 호출할 수 있다.
	 * */
	
	// Box내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		// Object가 가지고 있는 equals()메소드를 호출
		// Object의 equals()메소드로 content 필드값 비교
		boolean result = content.equals(other.content);
		return result;
	}
}
