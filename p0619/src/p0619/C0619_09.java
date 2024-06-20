package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//1.배열만들기
		String[]stuNo=new String[3]; //3명 학번
		String[]name=new String[3]; //이름
		int[][]score=new int[3][4]; //국영수합
		double[] avg=new double[3]; //평균
		int[]rank=new int[3]; //등수
		String[]title= {"학번","이름","국어","영어","수학","합계","평균","등수"};
		//				  0		1	 2	   3	 4    5		6	  7
		
		while(true) {
			//2. 실행부분
			System.out.println("------------------------");
			System.out.println("　　　　[ 성적 프로그램 ]");
			System.out.println("------------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------");
			System.out.print("> 번호 입력 : ");
			int choice=scan.nextInt(); //메뉴선택
			scan.nextLine(); 
			int s_count=0; 
			
			//3. 1번 - 입력
			switch(choice) {
			case 1:
				//1-1. 학번, 이름
				System.out.println("\t<성적 입력>");
				System.out.print(title[0]+": ");
				stuNo[s_count]=scan.nextLine();
				System.out.print(title[1]+": ");
				name[s_count]=scan.nextLine();
				//1-2. 국영수
				for(int i=0;i<3;i++) {					
					System.out.println(title[i+2]+": ");
					score[s_count][i]=scan.nextInt();
				}
				System.out.println();
				//1-3. 합계
				
				
				
				break;
			case 2:
				System.out.println("\t<성적 출력>");
				break;
			case 0:
				System.out.println("\t《프로그램 종료》");
			}
		}
		
	}

}
