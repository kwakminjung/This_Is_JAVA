package ch08.sec02;

public class Television implements RemoteControl {
	//�������̽� RemoteControl�� ����� turnOn �߻�޼ҵ� ������(�������̵�)
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
}
