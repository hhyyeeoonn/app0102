
public class 고양이 extends 동물 {
	// 나이가 중복된다 -> 상속을 이용하자
	//public int 나이;
	//public void 네발로움직인다() {
	//	System.out.println("네발로 걷다");
	//}
	@Override
	public void 움직인다() {
		System.out.println("네발로 움직이다");
	}
}
