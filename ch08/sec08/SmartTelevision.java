package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	//RemoteControl�������̽��� �߻�޼ҵ� �������̵�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	//Searchable�������̽��� �߻�޼ҵ� �������̵�
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
