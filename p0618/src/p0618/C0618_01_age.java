package p0618;

import java.util.Scanner;

public class C0618_01_age {

	public static void main(String[] args) {
		//-----------------------------------------------------------
		// ex) 990101-1011101
		// 12-02: 겨울, 03-05: 봄, 06-08: 여름, 09-11: 가을
		/*
		 * String str="990101"; 
		 * String birthM=str.substring(2,4); // 2번부터 4번 전까지 -> 01
		 * System.out.println(birthM);
		 */ 
		//-----------------------------------------------------------
		// 주민번호 앞자리를 입력받아 태어난 달의 계절 출력
		//-----------------------------------------------------------
//		Scanner scan=new Scanner(System.in);
//		System.out.println("주민등록번호 앞자리 6자리를 입력하세요");
//		String input=scan.nextLine();
//		System.out.println("입력 : "+input); // 입력받음
//		
//		// 달 숫자 2개를 가져오기
//		String str=input;
//		String birthM=str.substring(2,4);
//		
//		// 중첩 switch
//		switch (birthM) {
//		case "03": case "04": case "05":
//			System.out.println("봄");
//			break;
//		case "06": case "07": case "08":
//			System.out.println("여름");
//			break;
//		case "09": case "10": case "11":
//			System.out.println("가을");
//			break;
//		case "12": case "01": case "02":
//			System.out.println("겨울");
//			break;
//		}
		//-----------------------------------------------------------
		// 주민번호로 나이 출력
		// 뒷자리 1,2=1900년도, 3,4=2000년도
		//-----------------------------------------------------------
		Scanner scan=new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String input=scan.nextLine();
		System.out.println("입력 : "+input); // 입력받기
		
		String year=input.substring(0,2); // 연도 = year
		String cen=input.substring(6,7);
		System.out.println(cen); // 세기 = cen
		
//		int n=Integer.parseInt(str); //문자열을 정수형으로 변경
//		int intYear=Integer.parseInt(year); // 연도를 숫자로 변경
		
		int age=0;
		
		switch (cen) {
		case "1": case "2":
			age=2024-Integer.parseInt("19"+cen);
			break;
		case "3": case "4":
			age=2024-Integer.parseInt("20"+cen);
			break;
		}
		System.out.println("나이 : "+age);
	}

}
