//java는 "extends 강아지, 로봇" 형태의 다중상속이 지원되지 않는다 다중상속은 클래스 기준 문법 
//java는 인터페이스의 구현(implements)을 통해 다중상속같은 
public class 강아지로봇 extends 강아지 implements I로봇 { //인터페이스는 추상클래스와 같은 기능을 함 (인터페이스는 상속이 아니라 구현한다고 표현) 
	@Override
	public void on() {
		System.out.println("전원을 켜다");
	}
	@Override
	public void off() {
		System.out.println("전원을 끄다");
	}
	public static void main(String[] args) {
		강아지로봇 a = new 강아지로봇();
		a.name = "뽀빠이";
		a.on();
	}
}
// 추상클래스도 인터페이스도 클래스다!
// 구체적 <- 클래스|추상클래스|인터페이스 -> 추상적
// 추상클래스도 인터페이스도 부모역할(다형성)이 가능하다

