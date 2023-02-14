package ch08.sec06;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ� (������ü ���� �̿밡����)
	static void changeBattery() {
		System.out.println("������ �������� ��ȯ�մϴ�.");
	}
}
