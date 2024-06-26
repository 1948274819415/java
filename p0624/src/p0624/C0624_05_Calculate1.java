package p0624;

import java.util.Scanner;

public class C0624_05_Calculate1 {

	public static void main(String[] args) {
		//두 수와 연산자(+ - * /) 입력받아서 
		//연산값 출력
		
		Scanner scan=new Scanner(System.in);
		
		//배열 사용
		int[] x=new int[2];
		for(int i=0;i<2;i++) {
			System.out.println((i+1)+"번 숫자:");
			x[i]=scan.nextInt();
			
		}
//		int x=scan.nextInt();
//		System.out.println("2번 숫자:");
//		int x2=scan.nextInt();
		
		System.out.println("연산자 입력(+ - * /): ");
		String str=scan.next();
		
		//인스턴스 메소드 = 객체선언 후, 참조변수명.메소드명
		Calculate c=new Calculate();
//		int result = c.cal(x[0], x[1], str);
		
//		if(str.equals("+")) {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x+x2)+"입니다.");
//		}else if(str.equals("-")) {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x-x2)+"입니다.");
//		}else if(str.equals("*")) {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x*x2)+"입니다.");
//		}else {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x/x2)+"입니다.");
//		}
//		
		

	}

}
