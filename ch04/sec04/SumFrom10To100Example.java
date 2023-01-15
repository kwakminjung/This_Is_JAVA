package ch04.sec04;

public class SumFrom10To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for (i = 1 ; i<=100 ; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "гу: " + sum);
	}

}
