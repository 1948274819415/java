package p0624;

public class C0624_07_Element {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int [] result=new int[4];
		
		Element e=new Element();
		e.allCal(a, b, result);
		
		System.out.println("+:"+result[0]);
		System.out.println("-:"+result[1]);
		System.out.println("*:"+result[2]);
		System.out.println("/:"+result[3]);
		
		//Element 메소드를  활용해서
		//a,b 의 사칙연산 결과값 출력
		
		
		//1. 덧셈 값
		/*
		Element e=new Element();
		int add=e.cal(a, b);
		int sub=e.minus(a,b);
		
		System.out.println("더하기:"+add);
		System.out.println("더하기:"+sub);
		*/
		
		
	}
}
