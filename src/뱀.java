
public class 뱀 extends 동물 {
	// 나이가 중복된다 -> 상속을 이용하자
	// 동일한 행위지만 구체적인 행위가 다른 기능들을 하나로 추상화시켜 부모단에서 통일 
	// -> 부모클래스에 추상메소드로 생성
	//public int 나이;
	//public void 몸으로움직인다() {
	//	System.out.println("기어다닌다");
	//}
	@Override
	public void 움직인다() {
		System.out.println("기어다닌다");
	}
}
