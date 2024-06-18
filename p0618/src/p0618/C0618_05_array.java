package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05_array {

	public static void main(String[] args) {
		//-----------------------------------------------------------
		/*
		 <배열>
		 	-5개의 int값을 저장할 수 있는 배열을 생성한다
		 		int[] score=new int[5];
		 	-int배열엔 int만 가능 (문자형 통일하지 않으면 error)
		 	-공간 삭제안됨. 삭제하고 싶으면 배열자체를 다시 만들어야 함.
		 	-주소는 0번부터 시작함.
		 	-score 에는 주소값이 들어감.
		  */
		// 배열의 초기화
		int[] score=new int[5]; //= int score[]=new int[5]; 이렇게 해도 ok
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//		System.out.println(score[3]); //4
		//-----------------------------------------------------------
		//배열 입력
		for(int i=0;i<5;i++) {
			score[i]=i+1;
		}
		// 배열 출력
		for(int i=0;i<5;i++) {
			System.out.println(score[i]); // 1 2 3 4 5
		}
		//-----------------------------------------------------------
		System.out.println(Arrays.toString(score)); // [1, 2, 3, 4, 5]
		//-----------------------------------------------------------
		// 5개 숫자 입력받은 후, 모두 출력
		//-----------------------------------------------------------
		Scanner scan=new Scanner(System.in);
		
		System.out.println("숫자 5개 입력하세요.");
		
		for(int i=0;i<5;i++) {
			score[i]=i+1;
		}
		}
		
	}