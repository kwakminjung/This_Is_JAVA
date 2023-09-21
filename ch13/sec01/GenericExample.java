package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {		
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		
		/*Box<String> box1 = new Box<>(); 와 Box<String> box1 = new Box<>(); 의 차이
		 * 문법적인 차이일 뿐 기능적으로는 동일하다.
		 * Box<String> box1 = new Box<>();
		 * : Java7 이후 도입된 방법
		 * Box<String> box1 = new Box<String>();
		 * : Java7 이전의 선언방식. 변수를 선언할 때 제네릭 타입 파라미터를 중복해서 명시적으로 써줘야한다.
		 * 
		 * Java7 이상에서는 다이아몬드 연산자(<>)만 사용하는 첫번째 방법이 간결하고 좋은 방법이다.
 		 * */
	}
}
