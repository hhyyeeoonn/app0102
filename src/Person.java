import java.util.ArrayList;

public class Person extends Product {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.price = 100;
		
		Car car = new Car();
		car.price = 20000;
		
		// System.out.println(tv.price + car.price); ->부모타입을 두면 이런 코드를 줄일 수 있다 부모타입이 없었으면 매번 이런 코드를 적어야한다 
		// 10개면 100개면...
		// TV와 Car를 추상화시켜 공통분모를 찾아보자
		// 상품이라는 공통분모를 만들자 => 추상화
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(tv); // 제너릭이 Product타입이니까 tv, car 가능 -> 다형성
		list.add(car);
		int total = 0;
		for(Product p : list) {
			total += p.price; // 필드...(?) price라는 필드에서 공통분모찾기...(?)
		}
		System.out.println(total);
	}
}
