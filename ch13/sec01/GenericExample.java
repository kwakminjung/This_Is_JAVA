package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {		
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "�ȳ��ϼ���.";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		
		/*Box<String> box1 = new Box<>(); �� Box<String> box1 = new Box<>(); �� ����
		 * �������� ������ �� ��������δ� �����ϴ�.
		 * Box<String> box1 = new Box<>();
		 * : Java7 ���� ���Ե� ���
		 * Box<String> box1 = new Box<String>();
		 * : Java7 ������ ������. ������ ������ �� ���׸� Ÿ�� �Ķ���͸� �ߺ��ؼ� ��������� ������Ѵ�.
		 * 
		 * Java7 �̻󿡼��� ���̾Ƹ�� ������(<>)�� ����ϴ� ù��° ����� �����ϰ� ���� ����̴�.
 		 * */
	}
}
