package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//2개의 문자열을 입력받아
		//숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램 구현하세요
		System.out.println("1번 문자열 : ");
		String str=scan.next();
		char ch1=str.charAt(0);
		
		System.out.println("2번 문자열\n> ");
		String str2=scan.next();
		char ch2=str2.charAt(0);
		
		if ((ch1>='0' && ch1<='9')|| (ch2>='0' && ch2<='9')) {
			int num=ch1-'0'; //문자숫자를 정수형으로 변경하는 법 : '0' 빼줌
//			int n=Integer.parseInt(str); //문자열을 정수형으로 변경
			int num2=ch2-'0';
			System.out.println(num+num2);
		}else {
			System.out.printf("%c, %c\n",ch1, ch2);
		}
		
		

	}

}
