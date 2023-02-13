package ch08.sec03;

public class RemoteControlExample {
	public static void main(String[] args) {
		//상수는 구현 객체와 관련없는 인터페이스 소속 멤버이므로
		//인터페이스에 바로 접근하여 상수값을 읽을 수 있음
		System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUME);
	}
}
