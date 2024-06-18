package p0618;

import java.util.Scanner;

public class C0618_03 {

	public static void main(String[] args) {
		// 입력한 숫자를 출력하고 x,X 입력하면 종료되도록 구현하기
		// 프로그램 종료할 때 입력한 숫자의 합을 출력
		Scanner scan=new Scanner(System.in);
		
		int sum=0;
		
		while (true) {
			System.out.println("숫자를 입력하세요 (종료:x) > ");
			String input=scan.nextLine();
			if(input.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			sum+=Integer.parseInt(input);
			System.out.println("입력한 숫자 : "+input+"\n합계 : "+sum);
		}

	}

}
