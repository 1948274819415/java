package p0624;

import java.util.Scanner;

public class C0624_04_Cal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] num=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 숫자 : ");
			num[i]=scan.nextInt(); //리턴값 int
		}
		
		//인스턴스 메소드 쓰려면 --->
		//객체 선언 --->
		//참조변수명.메소드명
		Cal c=new Cal();
		int result=c.add(num[0],num[1],num[2]);
		
		int sum=c.add2(num);
		
		System.out.println("합계 : "+result);
		
//		//3개 수를 입력받아 더한 값 출력
//		//배열사용
//		int[] num=new int[3];
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)+"번째 숫자 : ");
//			num[i]=scan.nextInt();
//		}
//		System.out.println("더하기 결과값 : "+(num[0]+num[1]+num[2]));
//		//-------------------------------------1번째 방법
//		int sum=0;
//		for(int i=0;i<3;i++) {
//			sum+=num[i];
//		}
//		System.out.println("합계 : "+sum);
//		//-------------------------------------2번째 방법
	
	}
}
