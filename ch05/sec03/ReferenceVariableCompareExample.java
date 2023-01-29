package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		// 배열은 참조 타입 변수이므로 변수의 값은 객체의 번지이다.
		// ==, != 연산자로 번지를 비교하고 같은 객체인지 다른 객체인지
		// 연산할 수 있다.
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}

}
