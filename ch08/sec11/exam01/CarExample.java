package ch08.sec11.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new KumhoTire(); //타이어 교체 (한국->금호)
		myCar.tire2 = new HankookTire(); //타이어 교체 (금호->한국)
		
		//run()메소드 실행(다형성 : 실행결과가 다름)
		myCar.run();
	}
}
