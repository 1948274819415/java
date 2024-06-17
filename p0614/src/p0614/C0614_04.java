package p0614;

public class C0614_04 {
//	int num; // 클래스 내 변수 - 자동으로 초기화가 됨. --> 이렇게하면 234번 에러남
	static int num; //-->이렇게 하면 안남 
	// 메소드 내에서는 무조건 변수값 초기화 해야함
	public static void main(String[] args) {
		int score=0;
		System.out.println(score); //score를 초기화 해주지 않으면 error
		System.out.println(num); //234번 / 클래스변수는 초기화 해주지 않아도됨.
		
	}

}
