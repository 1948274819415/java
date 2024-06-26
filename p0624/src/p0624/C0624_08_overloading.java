package p0624;

public class C0624_08_overloading {

	public static void main(String[] args) {
		
		//객체선언
		Stu_score stu; //stu 공간 하나만 생김
//		stu.kor=100;//공간없는데 어떻게 저장해? -> error
//		Stu_score s=new Stu_score("s0001","홍길동",100,90,99); //이렇게만 하면 공간 안만들어짐.//2번
//		Stu_score s2=new Stu_score(100,100,100); //Stu_score에서 
		// 매개변수 생성자를 이미 만들어서 기본생성자가 없음.!! -> 2번이 error남
//		s.kor=100; // 이러면 완성
//		
//		System.out.println("s.kor:"+s.kor); //100
		
		
		/*
		println_boolean();
		println_char();
		
		int a=10;
//		int a=100; // a라는 이름 똑같이 못씀! -> error
		
		but 오버로딩 : 이름이 같아도 매개변수가 다르면 다른 메소드
			-변수의 이름 같아도 된다
			-변수의 개수는 달라야한다
			-(int a) == (int b) :이건 같은거임, 타입이 달라야함
			-리턴타입(ex.int, long)은 상관없음. 오직 변수타입만 봄
			
		long add(int a,long b) => 얘랑
		long add(long a,int  b) => 얘는 오버로딩 O
		*/ 
		/*
		Data d=new Data();  ==> 생성자!(인스턴스 초기화 메소드)
		생성자가 있어야 저장공간이 생김
		
		생성자
			-생성자의이름은 클래스 이름과 같아야함 (다르면 메소드임)
			-생성자는 리턴값이 없다(하지만 void 쓰지않는다)
		*/
		
		
		
		
		
		
		//5! =5*4*3*2*1
		int result=1;
		for(int i=4;i>0;i--) { //i=4:4!, i=5:5! 
			result*=i; 
		}
		System.out.println(result);
		//change
		C0624_08_overloading c=new C0624_08_overloading();
		c.change();
		/*
		void add() {
			
		} ====> 메소드 내 메소드 선언 못함
		
		add(); ====> 호출만 가능
		*/ 
		
		add();//객체선언 없이 [클래스명.메소드명], 같은 클래스 내에서 클래스명 생략가능
	}
	//------------------------------------오버로딩:다 다른 메소드
	void change() { //인스턴스 메소드 - 객체선언 후, [참조변수명.메소드명]
		System.out.println(0);
	}
	//------------------------------------오버로딩
	void change(int a) {
		System.out.println(a);
	}
	//------------------------------------오버로딩
	void change(int a,int b) {
		System.out.println(a+b);
	}
	//------------------------------------오버로딩
	static void add() {
		
	}//====> 메소드 밖이어도 static 붙여야 함

}
