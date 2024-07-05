package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		//문자열을 입력받아 2번째 문자 출력
		//문자열이 3칸미만으로 입력되면 다시 입력할수 있게
		//x가 입력되면 프로그램 종료
		Scanner scan=new Scanner(System.in);
		System.out.println("문자입력(x:종료)");
		while(true) {
			
			String str=scan.nextLine();
			if (str.equalsIgnoreCase("x")) break;
			else {
				char ch=str.charAt(1);
				System.out.println(ch);
			}
		}

	}

}
