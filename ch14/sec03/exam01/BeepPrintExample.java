package ch14.sec03.exam01;

import java.awt.*;

/*Thread Ŭ������ �۾� ������ ��ü�� ���� �����Ϸ��� ������ ���� Runnable ���� ��ü�� �Ű������� ���� �����ڸ� ȣ���ϸ� �ȴ�.
 * Thread thread = new Thread(Runnable target);
 * 
 *  Runnable�� �����尡 �۾��� ������ �� ����ϴ� �������̽���. Runable�� ���� �ִ� run() �޼ҵ带 �������ؼ� �����尡 ������ �ڵ带 ������ �־���Ѵ�.
 *  class Task implements Runnable {
 *  	@Override
 *  	public void run() {
 *  		// �����尡 ����� �ڵ�
 *  	}
 *  }
 *  
 *  Runnable ���� Ŭ���� Task�� �۾� ������ ������ ���̹Ƿ� �����忡�� �����ؾ� �Ѵ�.
 *  Runnable task = new new Task();
 *  Thread thread = new Thread(task);
 *  
 * ���� ���Ǵ� ����� ������� Runnable ���� Ŭ������ �ۼ����� �ʰ� Thread �����ڸ� ȣ���� �� Runnable �͸� ���� ��ü�� �Ű������� ����ϴ� ���̴�.
 * Thread thread = new Thread(new Runnable() {
 * 		@Override
 * 		public void run() {
 * 			// �����尡 ����� �ڵ�
 * 		}
 * }); 
 * 
 * 	�۾� ������ ��ü�� �����Ǿ��ٰ� �ؼ� �ٷ� �۾� �����尡 ��������� �ʴ´�. �۾� �����带 ���� �Ϸ��� ������ ��ü�� start() �޼ҵ带 ������ ���� ȣ���ؾ� �Ѵ�.
 * 	thread.start();
 *  
 * */

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// �� �����尡 ������
		for(int i = 0 ; i < 5 ; i++) {
			toolkit.beep(); //  ������ �߻�
			try { Thread.sleep(500); } catch ( Exception e ) {} // 0.5�ʰ� �Ͻ� ����
		}
		
		// �� �����尡 ���۵ȴ�.
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch (Exception e) {} // 0.5�ʰ� �Ͻ� ����
		}
		
		// ���� �����尡 ���ÿ� �� ���� �۾��� ó���� �� ����.
	}
	
	/*
	 * ���� ������ 0.5�� �ֱ�� �������� �߻���Ű�鼭 ���ÿ� �����ñ��� �ϴ� �۾��̾�����, ���� ������� �������� ��� �߻��� �������� �������� �����Ѵ�.
	 * */
}
