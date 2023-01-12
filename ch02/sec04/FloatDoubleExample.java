package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float var1 = 0.1234567890123456789f; //0.12345679
		double var2 = 0.1234567890123456789; //0.12345678901234568
		/* 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에
		 * double 타입 변수에 대입해야 함. float 타입에 대입하고 싶다면
		 * 리터럴 뒤에 'F'나 'f'를 붙여 컴파일러가 float 타입임을 알 수 있도록 해야 함
		   double 타입은 float타입보다 약 2배 정도의 정밀도를 갖음*/
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: " + var3); //3000000.0
		System.out.println("var4: " + var4); //3000000.0
		System.out.println("var5: " + var5); //0.002
	}

}
