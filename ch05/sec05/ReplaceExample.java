package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
