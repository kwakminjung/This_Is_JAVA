package ch13.sec02.exam01;

import ch13.sec02.*;

public class GenericExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("����ƮTv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		//-----------------------------------
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV�ڵ���");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
