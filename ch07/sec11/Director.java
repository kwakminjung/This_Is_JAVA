package ch07.sec11;

public class Director extends Manager {
	//봉인된 클래스 Person의 자식클래스 Manager를 상속받은 클래스 Director
	//Manager은 non-sealed로 선언된 클래스이므로 상속이 가능하여 Director클래스가
	//만들어질 수 있음
	@Override
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}
