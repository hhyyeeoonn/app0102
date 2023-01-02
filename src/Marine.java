public class Marine extends Unit {
	
	@Override
	public void work() {
		System.out.println(this.name + "총을 쏘다");
	
	// 부모 메서드를 재정의 : 오버라이딩 
	// super.work()
	// this.work()
	}
	/*
	public void work() { 
	System.out.println(this.name + "싸우다");
	}
	*/
	//@Override // 주석이지만 기능이 있음 이게 오버라이딩이라는 것을 알려줌 생략가능
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		m1.name = "해병1";
		m1.hp = 80;
		// m1.work();
		m1.work(); // 외부에서는 super 호출 불가
	}
}
