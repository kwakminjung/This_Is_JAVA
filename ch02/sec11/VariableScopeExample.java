package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10; //if문 안에서만 v2사용 가능
		}
		//int v3 = v1 + v2 + 5;  v2변수를 사용할 수 없으므로 컴파일 에러
	}

}
