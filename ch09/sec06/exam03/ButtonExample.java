package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {
			// 인터페이스ClickListener의 onClick메소드를 재정의 함
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		// setClickListener: Button 객체가 가지도 있는 인터페이스 세터하는 메소드
		btnOk.setClickListener(new OkListener());
		
		btnOk.click();
		
		Button btnCancle = new Button();
		
		class CancleButton implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}
		
		btnCancle.setClickListener(new CancleButton());
		
		btnCancle.click();
		
		
		// 7장 ClcikListener 익명 구현 객체를 이용한 방법 -> 코드가 간결해진다.
		Button btnCheck = new Button();
		
		btnCheck.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("체크 버튼을 클릭했습니다.");
			}
		});
		
		btnCheck.click();
	}
}
