package ch07.sec11;

public final class Employee extends Person {
	//봉인된 클래스 Person의 자식 클래스 Employee
	//final키워드로 선언하여 더 이상 상속할 수 없음을 나타냄 -> 자식 클래스 못 만듦
	
	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
	}
}
