package ch05.sec06;

public class ArrayCreateByValueExample2 {
	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] { 83 , 90 , 87 };
		int sum1 = 0;
		for( int i = 0 ; i < 3 ; i ++ ) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		//�迭�� �Ű������� �ְ�, printItem() �޼ҵ� ȣ��
		printItem( new int[] { 83 , 90 , 87 });
	}
	//printItem() �޼ҵ� ���� int[] scores -> {83, 90, 87}
	public static void printItem( int[] scores) {
		// �Ű������� �����ϴ� �迭�� �׸��� ���
		for( int i = 0 ; i < 3 ; i ++ ) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}
}
