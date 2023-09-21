package ch09.sec06.exam03;

public class Button {
	// 정적 중첩 인터페이스
	public static interface ClickListener {
		void onClick();
	}
	
	// 중첩 인터페이스 타입으로 필드와 Setter 선언
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// click 메소드를 통해서 인터페이스의 메소드에 접근
	public void click() {
		this.clickListener.onClick();
	}
}