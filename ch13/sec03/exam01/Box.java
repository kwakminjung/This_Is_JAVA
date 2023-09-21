package ch13.sec03.exam01;

public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
