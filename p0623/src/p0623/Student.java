package p0623;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
static Scanner scan=new Scanner(System.in); //클래스변수

String stuNo;
String name;
int kor;
int eng;
int math;
int total;
double avg;
int rank;

//화면부분
int screen() {
	System.out.println("[ 학생성적 프로그램 ]");
	System.out.println("---------------------");
	System.out.println("1. 성적입력");
	System.out.println("2. 성적출력");
	System.out.println("3. 성적수정");
	System.out.println("4. 학생검색");
	System.out.println("5. 등수처리");
	System.out.println("0. 프로그램 종료");
	System.out.println("---------------------");
	System.out.println("원하는 번호를 입력하세요.>> ");
	int choice=scan.nextInt(); //메뉴선택
	scan.nextLine();
	return choice;
}//screen

//성적입력 : Stu_score[] sc,int s_count
int stu_input(Stu_score[] sc,int s_count) {
	while(true) {
		System.out.println("[ 학생 성적입력 ]");
		//학번생성
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy");
		stuNo="S"+sdf.format(date)+String.format("%03d", s_count+1);
		System.out.println("학번 : "+stuNo);
		//이름저장
		System.out.println("이름 (0.이전페이지 이동): ");
		name=scan.nextLine();
		
		//이전페이지 이동
		if (name.equals("0")) {
			System.out.println("이전페이지로 돌아갑니다.");
			System.out.println();
			break;
		}//이전페이지 if
		//국영수 점수 저장
		System.out.println("국어점수 : ");
		kor=scan.nextInt();
		System.out.println("영어점수 : ");
		eng=scan.nextInt();
		System.out.println("수학점수 : ");
		math=scan.nextInt();
		scan.nextLine();
		//객체선언 - 매개변수가 있는 생성자
		sc[s_count]=new Stu_score(stuNo,name, kor,eng,math);
		//입력완료
		System.out.println("<성적입력 완료!>");
		System.out.println("%s학생 성적이 저장되었습니다."+sc[s_count].name);
		System.out.println();
		s_count++;
	}//while
	return s_count;
}
}
