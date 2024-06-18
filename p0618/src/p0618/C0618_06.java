package p0618;

import java.util.Arrays;

public class C0618_06 {

	public static void main(String[] args) {
		// 배열 선언 - 주소는 0부터 시작 (score[0])
//		int[] score=new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5; // 값을 처음 넣는 것 = 배열의 초기화
//	
//		
//		// 2번째 방법
//		int[] s=new int[5];
//		for(int i=0;i<5;i++) {
//			score[i]=i+1;
//		}
//		
//		// 3번째 방법
//		int[] sc= {1,2,3,4,5};
//		
//		// 4번째 방법
//		int[] sc2=new int[] {1,2,3,4,5};
		
		//-----------------------------------------------------------
		// int 배열 10개 선언해서 1,3,5,... 10개 출력
		//-----------------------------------------------------------
		int[] score=new int[10];
		
		for (int i=0;i<10;i++) {
			score[i]=2*i+1; // 홀수
		}
		System.out.println(Arrays.toString(score)); //[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
	
		//-----------------------------------------------------------
	}

}
