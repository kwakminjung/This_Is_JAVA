package ch14.sec03.exam03;

import java.awt.*;

/*Thread 자식 클래스로 생성
 * 
 * 작업 스레드객체를 생성하는 또 다른 방법은 Thread의 자식 객체로 만드는 것이다. Thread 클래스를 상속한 다음 run() 메소드를 재정의해서
 * 스레드가 실행할 코드를 작성하고 객체를 생성하면 된다.
 * 
 *  public class WorkerThread extends Thread {
 *  	@Override
 *  	public void run() {
 *  		// 스레드가 실행될 코드
 *  	}
 *  }
 *  
 *  Thread thread = new WorkerThread();
 *  
 *  작업 스레드를 실행하는 방법은 thread.start(); 메소드를 호출하는 것으로 동일하다.
 *  
 *  많이 사용되는 방법으로는, 명시적인 작식 클래스를 정의하지 않고, 다음과 같이 Thread 익명 자식 객체를 사용하는 것이다.
 *  Thread thread = new Thread() {
 *  	@Override
 *  	public void run() {
 *  		// 스레드가 실행할 코드
 *  	}
 *  };
 *  thread.start();
 *  
 * */

public class BeepPrintExample {
	public static void main(String[] args) {
		
		// 자식 익명 객체
		Thread thread = new Thread() {
			@Override
			public void run() { 
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ; i < 5 ; i++) {
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
		thread.start();
		
		// 메인 스레드 코드
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
