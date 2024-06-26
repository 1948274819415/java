package p0624;

import java.util.Scanner;
public class Calculate {
	static Scanner scan=new Scanner(System.in);
	//3개에서(현재는 국영수 메소드 3개) 1개로 합치기
	//print는 C0624_06번에서 하고싶음.
	void change(int[] score) {
		System.out.println("변경된 국어점수 입력:");
		score[0]=scan.nextInt();

		System.out.println("변경된 영어점수 입력:");
		score[1]=scan.nextInt();

		System.out.println("변경된 수학점수 입력:");
		score[2]=scan.nextInt();
	}
	
	
	
	
//	int change(int score[]) {
//		for(int i=0;i<3;i++) {
//			System.out.printf("변경된 "+"%s"+"점수 입력:",score[i]);
//			score[i]=scan.nextInt();
//		}
//		return change;
//		
//	}
//	int korChange(int kor) {
//		Scanner scan=new Scanner(System.in);
//		//수정점수 입력을 여기서 받기!
//		System.out.println("변경된 국어점수 입력:");
//		kor=scan.nextInt();
//		return kor;
//	}
//	int engChange(int eng) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("변경된 영어점수 입력:");
//		eng=scan.nextInt();
//		return eng;
//	}
//	int mathChange(int math) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("변경된 수학점수 입력:");
//		math=scan.nextInt();
//		return math;
//	}
	
	
	
	
	
	
	//=====================================================
//	int result=0;
//	//cal() 메소드 사용
//	int cal(int x,int x2,String str) {
//		if(str.equals("+")) {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x+x2)+"입니다.");
//		}else if(str.equals("-")) {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x-x2)+"입니다.");
//		}else if(str.equals("*")) {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x*x2)+"입니다.");
//		}else {
//			System.out.println(x+"와 "+x2+"의 "+str+"값은 "+(x/x2)+"입니다.");
//		}
//		return result;
//	}
	
}
