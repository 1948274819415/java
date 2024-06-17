package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		//-----------------------------------------------
//		int sum=0;
//		for(int i=0;i<=10;i++) {//조건식
//			sum=sum+i;
//			System.out.println("i: "+i);
//			System.out.println("sum: "+sum);
//		}
//		System.out.println("최종 sum:");
		//-----------------------------------------------
		// 1~100 까지 더한 최종값 출력
		int sum=0;
		for (int i=1;i<=100;i++) {
			sum=sum+i;
			System.out.println("i: "+i);
			System.out.println("1~"+i+"까지의 합: "+sum);
		}
		//-----------------------------------------------
		
		// 1~100 까지 홀수의 합 출력
		// i+=2 하거나, if(i%2!=0) 라고 하거나 
		int sum1=0;
		for (int i=1;i<=100;i+=2) {
			sum1=sum1+i;
			System.out.println("i: "+i);
			System.out.println("1~"+i+"까지 홀수의 합: "+sum1);
		}
		//-----------------------------------------------
		// 10번 입력 받을때마다 합계 출력
//		int sum2=0;
//		Scanner scan=new Scanner(System.in);
//		for (int i=1;i<=10;i++) {
//			System.out.println("숫자 입력");
//			int n=scan.nextInt();
//			sum2=sum2+n;
//			System.out.println("입력한 값의 합 :"+sum2);
//		}
		//-----------------------------------------------
		// 구구단 - 이중 for 문 사용
		for (int i=2;i<=9;i++) {
			System.out.println("");
			System.out.println("[ "+i+"단 ]");
			for (int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
		//-----------------------------------------------
		// 1~100 까지 합, sum 이 150을 넘었을 때 i 와 sum 값 출력
		System.out.println("");
		int sum2=0;
		for (int i=1;i<=100;i++) {
			sum2=sum2+i;
			if (sum2>150) {				
				System.out.println("i : "+i+"\nsum : "+sum2);
				break;
			}
		}
		//-----------------------------------------------
		// 1~10 까지 합
		System.out.println("");
		int sum3=0;
		int i=0;
		for (i=1;i<=10;i++) {
			sum3+=i;
		}
		System.out.println("1~"+i+"까지의 합 : "+sum3);
		//-----------------------------------------------
		// 구구단 홀수단만 출력
		System.out.println("");
		int o=2;
		int j=1;
		for (o=3;o<=9;o+=2) {
			System.out.println("");
			System.out.println("[ "+o+"단 ]");
			for (j=1;j<=9;j++) {
				System.out.println(o+"x"+j+"="+o*j);
			}
		}
		//-----------------------------------------------
		
		
		
		
		
		
	}

}
