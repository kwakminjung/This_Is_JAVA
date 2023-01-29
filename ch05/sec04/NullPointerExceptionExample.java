package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10;
		//NullPointerException 발생 : intArray가
		//참조하는 배열객체가 없기때문
		
		String str = null;
		//System.out.println("총 문자 수: " + str.length());
		//NullPointerException 발생 : str 변수가 참조하는
		//string 객체가 없기때문
	}

}
