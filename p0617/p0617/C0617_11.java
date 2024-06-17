package p0617;

import java.util.Scanner;

public class C0617_11 {

	public static void main(String[] args) {
// -----------------------------------------------------------
//		String str=null;
//		String str="";
////		str.charAt(0); // 0번째꺼를 빼와랏
//		//----> null인데 0번째꺼가 어딨어 => error
//		if(str!=null && !str.equals(""))
//			str.charAt(0);
//		else
//			System.out.println("빈 문자다."); // 이거 나옴
// -----------------------------------------------------------
		Scanner scan=new Scanner(System.in);
		System.out.println("프로그램을 종료할까요? (x: 종료)");
		String str=scan.next();
		
		if(str.equals("x")||str.equals("x")) { // str은 무조건 equals 사용(== X)
			System.out.println("프로그램 종료");
		}else {
			System.out.println("프로그램 계속 실행");
		}
// -----------------------------------------------------------
//		if (str.equalsIgnoreCase("x")) ==> 대소문자 상관없이?
	}

}
