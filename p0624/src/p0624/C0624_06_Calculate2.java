package p0624;

import java.util.Scanner;

public class C0624_06_Calculate2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] score=new int[3]; //print 는 여기서 하고싶을 때 step1!. 배열로 만들기
		score[0]=100;
		score[1]=99;
		score[2]=90;
		
//		System.out.println("현재 국어점수:"+kor);
		
		//메소드 사용
		Calculate c=new Calculate();
		//-------- 
//		kor=c.korChange(kor);
//		eng=c.engChange(eng);
//		math=c.mathChange(math);
		//--------  이 세개 합쳐서
		c.change(score); //---- 이렇게 하기
		System.out.println("변경된 국 성적:"+score[0]);
		System.out.println("변경된 영 성적:"+score[1]);
		System.out.println("변경된 수 성적:"+score[2]);
		
//		System.out.printf("변경된 국영수 성적:"+kor,eng,math);
	}

}
