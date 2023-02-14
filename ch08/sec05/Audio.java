package ch08.sec05;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + volume);	
	}
	
	private int memoryVolume;
	
	//�������̽� RemoteControl�� ����Ʈ �޼ҵ� ������ (default -> public���� �����ؾ���)
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("���� ó���մϴ�.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("���� �����մϴ�.");
			setVolume(this.memoryVolume);
		}
	}
}
