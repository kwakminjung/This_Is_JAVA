# ch13 제네릭

### sec01 제네릭이란?
제네릭(Generic)이란 결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능이다.
```
public class Box <T> {
	public T content;
}
```
<T>는 T가 타입 파라미터임을 뜻하는 기호로, 타입이 필요한 자리에 T를 사용할 수 있음을 알려주는 역할을 한다.
즉, Box 클래스는 T가 무엇인지 모르지만, Box 객체가 생성될 시점에 다른 타입으로 대체된다는 것을 알고있다.
만약 Box의 내용물로 String을 저장하고 싶다면 다음과 같이 Box를 생성할 때 타입 파라미터 T 대신 String으로 대체하면 된다.
```
Box<String> box = new Box<String>();
box.content = "안녕하세요";
String content = box.content; // 강제 타입 변환 필요 없이 "안녕하세요"를 바로 얻을 수 있음 (Object 사용시에는 강제 형변환해야함)
```

##### ⚠주의할 점은 타입 파라미터를 대체하는 타입은 클래스 및 인터페이스라는 것이다. int와 같은 기본 타입은 타입 파라미터의 대체 타입이 될 수 없기 때문에 Integer를 사용해야한다



### sec02 제네릭 타입
제네릭 타입은 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다. 제네릭 타입은 선언부에 `<>` 부호가 붙고 그 사이에 타압 파라미터들이 위치한다.
```
public class 클래스명<A, B, ...> { ... }
public interface 인터페이스명<A, B, ...> { ... }
```
타입 파라미터는 일반적으로 대문자 알파벳 한 글자로 표현한다. 외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정해야 한다. 만약 지정하지 않으면 Object 타입이 암묵적으로 사용된다.



### sec03 제네릭 메소드
제네릭 메소드는 타입 파라미터를 가지고 있는 메소드를 말한다.
```
public <A, B, ...> 리턴타입 메소드명(매개변수, ...) { ... }
```

다음 boxing() 메소드는 타입 파라미터로 <T>를 정의하고 매개변수 타입과 리턴 타입에서 T를 사용한다.
```
public <T> Box<T> boxing(T t) { ... }
```

타입 파라미터 T는 매개값이 어떤 타입이냐에 따라 컴파일 과정에서 구체적인 타입으로 대체된다.
```
1. Box<Integer> box1 = boxing(100);
2. Box<String> box2 = boxing("Hello");
```
1은 100의 클래스 타입이 Integer이므로 타입 파라미터 T는 Integer로 대체되어 Box<Integer>가 리턴된다. 2은 "Hello"의 클래스 타입이 String이므로 타입 파라미터 T는 String로 대체되어 Box<String>가 리턴된다.



### sec04 제한된 타입 파라미터
경우에 따라서 타입 파라미터를 대체하는 구체적인 타입을 제한할 필요가 있다. (숫자연산 제네릭 메소드는 대체 타입으로 Byte, Short, Integer, Long, Double 등으로 제한)
모든 타입으로 대체할 수 없고, 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는 타입 파라미터를 제한된 타입 파라미터라고 한다.
```
public <T extends 상위타입> 리턴타입 메소드(매개변수, ...) { ... }
```
상위 타입은 클래스 뿐만 아니라 인터페이스도 가능하다. 인터페이스라고 해서 implements를 사용하지는 않는다.

```
public <T extends Number> boolean compare(T t1, T t2) {
	double v1 = t1.doubleValue(); // Number의 doubleValue() 메소드 사용
	double v2 = t2.doubleValue(); // Number의 doubleValue() 메소드 사용
	return (v1 == v2);
```



### sec05 와일드카드 타입 파라미터