package ch13.sec04;

public class GenericExample {
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(10, 20); // compare(Integer, Integer)
		System.out.println(result1); //false
		System.out.println();
		
		boolean result2 = compare(4.5 , 4.5); // compare(Double, Double)
		System.out.println(result2); //true
		
	}
}
