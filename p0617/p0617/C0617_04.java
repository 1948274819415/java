package p0617;

import java.util.Scanner;

public class C0617_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자 입력");
//		String str=scan.nextLine();
//		// String 참조형 변수
//		int n=Integer.parseInt(str); //문자열을 정수형으로 변환
//		System.out.println("숫자 입력");		
//		String str2=scan.nextLine();
//		int n2=Integer.parseInt(str2);
//		System.out.println("두 수의 합 : "+(n+n2));
//		
//		System.out.println("두 수의 합 : "+(str+str2));
//
//		System.out.println("숫자 입력");
//		int n=scan.nextInt();
//		System.out.println("숫자 입력");
		char ch='A'; //65
		char ch2='B';
		System.out.println(ch+ch2);
		
		int a=1000000;
		int b=1000000;
		System.out.println();
		
		// 소문자를 대문자 : -32
		// 소문자를 대문자 : +32
		char c1='a';
		System.out.println((char)(c1-32)); //A
		
		char c2='A';
		System.out.println((char)(c2+32)); //a
		
		char c3='3';
		char c4='2';
		System.out.println(c3-c4); // 51-50=1
		
		//문자 숫자타입을 정수타입으로 변경하는 방법 : '0'문자 0을 빼줌
		System.out.println((c3-'0')+(c4-'0'));
	}

}
