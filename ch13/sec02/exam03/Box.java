package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	/*
	 * Ÿ�� �Ķ���ʹ� �⺻������ Object Ÿ������ ���ֵǹǷ� Object�� ������ �ִ� �޼ҵ带 ȣ���� �� �ִ�.
	 * */
	
	// Box���빰�� ������ ��
	public boolean compare(Box<T> other) {
		// Object�� ������ �ִ� equals()�޼ҵ带 ȣ��
		// Object�� equals()�޼ҵ�� content �ʵ尪 ��
		boolean result = content.equals(other.content);
		return result;
	}
}
