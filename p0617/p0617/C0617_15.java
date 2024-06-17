package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		Math.random(); //0~0.999999
		System.out.println(Math.random());
		Math.max(10.5,5);
		//1~10사이 숫자 출력하는 법
		//각 항에 10씩 곱해줌
		//1. 0.0<=Math.random()<1.0
		//2. 0.0*10<=Math.random()*10<1.0*10
		//3. int형으로 변환 =(int)0.0*10<=(int)Math.random()*10<(int)1.0*10
		int num=(int)(Math.random()*10)+1;
		System.out.println(num);
		
		// 1~100
		int num2=(int)(Math.random()*100)+1;
		System.out.println(num2);
		
		// 0~4
		int num3=(int)(Math.random()*5);
		System.out.println(num3);
		
		// 0~19
		int num4=(int)(Math.random()*20);
		System.out.println(num4);
		
		// 1~100 랜덤출력
		int num5=(int)(Math.random()*100)+1;
		System.out.println(num5);
		
		// 1~3
		System.out.println((int)(Math.random()*3)+1);
		
		// 1~45
		System.out.println((int)(Math.random()*45)+1);
		
		// 1~10 생성 - 숫자 1개 입력받아 정답인지 아닌지 - 당첨 or 꽝
		Scanner scan=new Scanner(System.in);
		int num6=(int)(Math.random()*10)+1;
		int input=scan.nextInt();
		if (num6==input) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
	}

}
