package ch08.sec09;

public class InterfaceCImpl implements InterfaceC {
	//�ΰ��� �������̽��� ��ӹ޴� C�������̽��� ������ü
	//�ڽ��������̽��� �θ��������̽��� ��� �߻�޼ҵ带 �������ؾ���
	
	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() ����");
	}
	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() ����");
	}
	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() ����");
	}
}
