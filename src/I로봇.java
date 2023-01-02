
public interface I로봇 { // 인터페이스 : 하나의 클래스 추상메소드만 가질 수 있다
	/* 1) 정적 상수
	 * 2) 추상메소드
	 * 3) 디폴트메소드(정의된 메소드)
	 * 4) 함수형 인터페이스
	 */
	// 2) 경우만 사용 1)3)4)는 다른 특별한 곳에 사용됨
	public abstract void on();
	public abstract void off();
}
