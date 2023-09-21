package ch13.sec02.exam02;

public interface Rentable<P> {
	// 타입 파라미터 P를 리턴타입으로 사용
	P rent();
}
