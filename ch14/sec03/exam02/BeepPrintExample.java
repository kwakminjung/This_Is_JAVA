package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		// ������ �߻��� ����� ���ÿ� �ϰ� �ʹٸ�, �� �۾� �� �ϳ��� �۾� �����忡�� ó���ϵ��� �ؾ� �Ѵ�.
		
		// ������ �߻��� �۾� �����忡�� ó���ϵ��� ��
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ; i < 5 ; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});
		
		// �۾� ������ ����
		thread.start();
		
		// ���� �����尡 ����Ǵ� �ڵ�
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
