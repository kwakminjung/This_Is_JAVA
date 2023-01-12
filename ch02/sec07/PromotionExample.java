package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 타입 변환 byte < short, char < int < long < float < double
		// 작은 허용 범위 타입 -> 큰 허용 범위 타입
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue); //intValue: 10
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue); //가의 유니코드: 44032
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue); //longValue: 50
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue); //floatValue: 100.0
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue); //doubleValue: 100.5
	}

}
