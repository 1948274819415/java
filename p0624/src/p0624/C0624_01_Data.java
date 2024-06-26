package p0624;

public class C0624_01_Data {

	public static void main(String[] args) {
		//인스턴스변수 사용법
		//객체 선언 후 참조변수명.변수명
		Data d=new Data();
		d.x=10;
		System.out.println("d.x:"+d.x); //10
		
		change(d.x);
		System.out.println("d.x 2:"+d.x);//10
		
	}
	static void change(int x) {
		x=1000;
		System.out.println("change x:"+x); //1000
	}

}
