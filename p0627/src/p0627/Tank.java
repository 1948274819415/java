package p0627;

public class Tank extends GroundUnit implements Repairable {
	
	Tank() {
		super(150); //
		hitPoint = MAX_HP;
	}

	
}
//	@Override
//	void move(int x, int y) {
//		// TODO Auto-generated method stub
//	//이거 하고싶으면 [abstract void move(int x, int y)]써야함
//	} //구현해야 할 메소드가 있다는 뜻 ---> 오버라이딩 해야 실행됨

	
// 부모에있는 메소드를 재정의 하는것:오버라이딩
// 이름은똑같은데 개수나 타입이 다른것:오버로딩
// 추상메소드:구현이 안된 메소드-객체선언 할 수 없음. 구현을 해야 객체선언 할수있음
// <인터페이스>
//	-추상클래스인데 추.클보다 추상화정도가 높다. 
//	-클래스처럼 상속이 가능하다


