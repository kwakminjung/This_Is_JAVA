package ch04.sec03;

public class SwitchExpressonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade ='B';
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("��� ȸ���Դϴ�.");
			}
			case 'B', 'b' -> {
				System.out.println("�Ϲ� ȸ���Դϴ�.");
			}
			default -> {
				System.out.println("�մ��Դϴ�.");
			}
		}
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("��� ȸ���Դϴ�.");
		case 'B', 'b' -> System.out.println("�Ϲ� ȸ���Դϴ�.");
		default -> System.out.println("�մ��Դϴ�.");
		}
	}

}