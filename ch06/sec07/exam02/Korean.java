package ch06.sec07.exam02;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	//생성자 선언
	public Korean(String name, String ssn) {
		//가독성을 위해 필드명과 매개변수명을 동일하게 함
		//-> 필드와 매개변수의 이름이 같으므로 this키워드 써야함
		//이클립스에서 필드는 파란색, 매개변수는 갈색임
		this.name = name;
		this.ssn = ssn;
	}
}
