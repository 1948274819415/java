package p0617;

import java.util.Scanner;

public class C0617_13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//if, switch
		//두 수를 입력받아, 사친연산 프로그램 만들기
		System.out.println("1번 숫자 입력");
		int n1=scan.nextInt();
		System.out.println("2번 숫자 입력");
		int n2=scan.nextInt();
		
		System.out.println("1번:+, 2번:-, 3번:/, 4번:*");
		System.out.println("원하는 연산자 번호 입력");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1: //case 는 } or break 를 만나야 멈춤
			System.out.println("더하기: "+(n1+n2));
			break;
		case 2:
			System.out.println("뺄셈: "+(n1-n2));
			break;
		case 3:
			System.out.printf("나눗셈: "+(n1/n2));
			break;
		case 4:
			System.out.println("곱셈: "+(n1*n2));
			break;
		}

	}

}
