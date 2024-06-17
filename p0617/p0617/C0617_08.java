package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		System.out.println("문자 입력");
////		String str=scan.next();  ---> 띄어쓰기 전까지만 셈. 안녕 반가워 ->2글자!
//		String str=scan.nextLine();
//		System.out.println("입력한 문자의 길이 : "+str.length());
//		-----------------------------------------------------------------------
//		int x=-10;
//		int absX=x>=10?x:-x;
//		System.out.println(absX); //10
//		-----------------------------------------------------------------------
//		System.out.println("숫자입력");
//		int x=scan.nextInt();
//		int absX=x>=0?x:-x;
//		System.out.println(absX);
//		-----------------------------------------------------------------------
		// 숫자 입력받아 양, 음, 0입니다. 라고 출력되게 구현
//		System.out.println("숫자 입력");
//		int x=scan.nextInt();
//		String str=x>0?"양수":x==0?"0이다":"음수";
//		System.out.println(str);
//		-----------------------------------------------------------------------
		int a=10;
		if(a>0) {
			System.out.println("양수");
		}else if (a==0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수");
		}
		if (a>0)
			System.out.println("양수");
		else if(a==0)
			System.out.println("음수");
		else
			System.out.println("0");
	}

}
