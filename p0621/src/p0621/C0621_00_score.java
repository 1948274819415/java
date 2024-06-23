package p0621;

import java.util.Scanner;

public class C0621_00_score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//3명 학생 - 국어,영어,수학
		// 학번-stu0001 S,이름-S,국어-i,영어-i,수학-i,합계-i,평균-d,등수-i
		final int STU=20; //전체학생수
		String[] stuNo=new String[STU]; //학번
		String[] name=new String[STU]; //이름
		int[][] score=new int[STU][4]; //국영수합
		double[] avg=new double[STU]; //평균
		int[] rank=new int[STU]; //등수
		String[]title={"학번","이름","국어","영어","수학","합계","평균","등수"}; //목록
			  //		  0	   1	2	  3	    4     5	   6     7
		int s_count=0; //입력된 학생 수
		
		//----- 프로그램 실행 -----
		Loop1:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt(); // 1  enter키
			scan.nextLine();
			
			switch(choice) {
			case 1:
				
				//입력화면
				while(true) {
					System.out.println("[ 성적입력 ]");
					// 학번 자동부여 - S0001
					stuNo[s_count]="S"+String.format("%04d", s_count+1);
					System.out.println("학번 : "+stuNo[s_count]); 
					
					//이름입력->취소
					System.out.println("이름 (0:이전화면): ");
					String temp=scan.nextLine();
					if (temp.equals("0")){
						System.out.println("이전화면으로 돌아갑니다!");
						break;
					}
					
					//이름
					name[s_count]=temp;
					
					//
					
				}//S.while
			}//switch
		}//B.while
	}//main

}//class
