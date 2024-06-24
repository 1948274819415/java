package p0623;

import java.util.Scanner;

public class C0623_01 {

	public static void main(String[] args) {
		//변수선언
		Student sp=new Student();
		Stu_score[]sc=new Stu_score[10]; //배열선언
		String[]title={"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count=0; //입력된 학생 수
		
		while(true) {
			//화면부분
			int choice=sp.screen();
			
			switch(choice) {
			case 1: //학생성적 입력부분 - 학생 입력수는 리턴으로 받아야 함
				s_count=sp.stu_input(sc, s_count);
				break;
			case 2: //성적출력
//				sp.stu_output(sc,s_count,title);
				break;
			}
			
		}
		

	}

}
