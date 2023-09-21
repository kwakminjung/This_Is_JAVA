package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {
			// �������̽�ClickListener�� onClick�޼ҵ带 ������ ��
			@Override
			public void onClick() {
				System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		// setClickListener: Button ��ü�� ������ �ִ� �������̽� �����ϴ� �޼ҵ�
		btnOk.setClickListener(new OkListener());
		
		btnOk.click();
		
		Button btnCancle = new Button();
		
		class CancleButton implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancle ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		btnCancle.setClickListener(new CancleButton());
		
		btnCancle.click();
		
		
		// 7�� ClcikListener �͸� ���� ��ü�� �̿��� ��� -> �ڵ尡 ����������.
		Button btnCheck = new Button();
		
		btnCheck.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("üũ ��ư�� Ŭ���߽��ϴ�.");
			}
		});
		
		btnCheck.click();
	}
}
