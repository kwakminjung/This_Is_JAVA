package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {
	//두개의 인터페이스를 상속받는 C인터페이스의 구현객체
	//자식인터페이스와 부모인터페이스의 모든 추상메소드를 재정의해야함
	
	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}
	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}
	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}
}
