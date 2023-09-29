package ch14.sec03.exam01;

import java.awt.*;

/*Thread 클래스로 작업 스레드 객체를 직접 생성하려면 다음과 같이 Runnable 구현 객체를 매개값으로 갖는 생성자를 호출하면 된다.
 * Thread thread = new Thread(Runnable target);
 * 
 *  Runnable은 스레드가 작업을 실행할 때 사용하는 인터페이스다. Runable이 갖고 있는 run() 메소드를 재정의해서 스레드가 실행할 코드를 가지고 있어야한다.
 *  class Task implements Runnable {
 *  	@Override
 *  	public void run() {
 *  		// 스레드가 실행될 코드
 *  	}
 *  }
 *  
 *  Runnable 구현 클래스 Task는 작업 내용을 정의한 것이므로 스레드에게 전달해야 한다.
 *  Runnable task = new new Task();
 *  Thread thread = new Thread(task);
 *  
 * 많이 사용되는 방법은 명시적인 Runnable 구현 클래스를 작성하지 않고 Thread 생성자를 호출할 때 Runnable 익명 구현 객체를 매개값으로 사용하는 것이다.
 * Thread thread = new Thread(new Runnable() {
 * 		@Override
 * 		public void run() {
 * 			// 스레드가 실행될 코드
 * 		}
 * }); 
 * 
 * 	작업 스레드 객체가 생성되었다고 해서 바로 작업 스레드가 실행되지는 않는다. 작업 스레드를 실행 하려면 스레드 객체의 start() 메소드를 다음과 같이 호출해야 한다.
 * 	thread.start();
 *  
 * */

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 이 스레드가 끝나야
		for(int i = 0 ; i < 5 ; i++) {
			toolkit.beep(); //  비프음 발생
			try { Thread.sleep(500); } catch ( Exception e ) {} // 0.5초간 일시 정지
		}
		
		// 이 스레드가 시작된다.
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {} // 0.5초간 일시 정지
		}
		
		// 메인 스레드가 동시에 두 가지 작업을 처리할 수 없다.
	}
	
	/*
	 * 원래 목적은 0.5초 주기로 비프음을 발생시키면서 동시에 프린팅까지 하는 작업이었지만, 메인 스레드는 비프음을 모두 발생할 다음에야 프린팅을 시작한다.
	 * */
}
