package ch09.sec06.exam03;

public class Button {
	// ���� ��ø �������̽�
	public static interface ClickListener {
		void onClick();
	}
	
	// ��ø �������̽� Ÿ������ �ʵ�� Setter ����
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// click �޼ҵ带 ���ؼ� �������̽��� �޼ҵ忡 ����
	public void click() {
		this.clickListener.onClick();
	}
}