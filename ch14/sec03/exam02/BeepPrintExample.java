package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
	public static void main(String[] args) {
		// 비프음 발생과 출력을 동시에 하고 싶다면, 두 작업 중 하나를 작업 스레드에서 처리하도록 해야 한다.
		
		// 비프음 발생을 작업 스레드에서 처리하도록 함
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
		
		// 작업 스레드 실행
		thread.start();
		
		// 메인 스레드가 실행되는 코드
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
