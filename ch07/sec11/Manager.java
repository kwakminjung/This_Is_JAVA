package ch07.sec11;

public non-sealed class Manager extends Person {
	//봉인된 클래스 Person의 자식클래스 Manager
	//non-sealed로 선언하여 봉인 해제함을 알림 -> 자식 클래스를 만들 수 있음
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
