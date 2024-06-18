package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		//-----------------------------------------------------------
		// 10개짜리 배열 생성하고 숫자를 10번 입력받아 3,4번째 숫자만 출력
		//-----------------------------------------------------------
		Scanner scan=new Scanner(System.in);
//		int[] ary=new int[10]; //배열
//		System.out.println("숫자 10개 입력하세요");
//		for(int i=0;i<10;i++) {
//			int n=scan.nextInt();
//			ary[i]=n;
//		}
//		System.out.printf("2번째,3번째 숫자 : %d, %d\n",ary[2],ary[3]);
		//-----------------------------------------------------------
		// 1~45 숫자 ball 배열 생성
		// myArr배열 만들어서, 6개의 숫자르 입력받아 출력
		//-----------------------------------------------------------
		int[] ball=new int[45]; // 45개의 ball 배열
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		} // ball 배열에 숫자 넣음
		
		int[] myArr=new int[6]; // 내번호 배열 생성
		for (int i=0;i<myArr.length;i++) {
			System.out.printf("1~45사이의 %d번째 숫자를 입력하세요\n",i+1);
			myArr[i]=scan.nextInt();
		}
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		
		// 랜덤으로 섞기
		int no=0; //랜덤번호
		int temp=0; //값을 저장
		
		for (int i=0;i<300;i++) {
			no=(int)(Math.random()*45); //0~44
			temp=ball[0];
			ball[0]=ball[no];
			ball[no]=temp;
		}
		
		System.out.println();
		System.out.printf("로또번호 : ");
		for (int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}
}
