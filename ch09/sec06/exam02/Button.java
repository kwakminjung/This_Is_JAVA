package ch09.sec06.exam02;

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
}