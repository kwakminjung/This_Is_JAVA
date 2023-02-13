package ch07.sec11;

public sealed class Person permits Employee, Manager {
	//봉인된 클래스 (자식클래스가 가능한 클래스는 Employee와 Manager만 있음)
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
