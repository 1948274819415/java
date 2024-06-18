package p0618;

import java.util.Scanner;

public class C0618_02_age {

	public static void main(String[] args) {
		// 나이 출력 프로그램 - if 문으로 변경
		
		System.out.println("주민등록번호를 입력하세요");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine(); // 입력받음
		
		String year=str.substring(0,2);
		String cen=str.substring(6,7);
		
		int intYear=Integer.parseInt(year);
		int age=0;
		if (cen.equals("1") || cen.equals("2")) {
			age=2024-Integer.parseInt("19"+year);
		}else if (cen.equals("3") || cen.equals("4")) {
			age=2024-Integer.parseInt("20"+year);
		}
		System.out.println(age);
	}

}
