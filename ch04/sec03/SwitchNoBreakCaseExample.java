package ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시간 : " + time + "시]");
		//case 끝에 있는 break는 다음 case를 실행하지 않고 switch문을 빠져나가기 위해 필요함
		//break가 없다면 다음 case가 연달아 실행되는데, 이때는 case값과 상관없이 실행된다.
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}

}
