package p0619;

import java.util.Scanner;

public class C0619_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//로또프로그램
		// 1~45배열 - 랜덤셔플 - 거기서 6개 뽑아온거=로또번호 lotto
		// 입력한 번호 6개 = myNum
		// 당첨번호 개수 배열, 카운트변수
		
		//1. 1~45배열
		int[] ball=new int[45]; //1~44
//		System.out.println(ball); // 주소값이 나옴
//		ball[0]=1;
//		System.out.println(ball[0]); //1
		for (int i=0; i<45;i++) {
			ball[i]=i+1; //배열에 숫자 넣기
		}
		

		//2. 숫자 넣기
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		//3. 숫자 섞기
		int no=0;
		int t_value=0;
		
		for (int i=0;i<300;i++) {
			no=(int)(Math.random()*45);
			t_value=ball[0];
			ball[0]=ball[no];
			ball[no]=t_value;
		}
		
		
		//4. 번호 입력받기
		
		int[] myBall=new int[6];
		for (int i=0;i<6;i++) {
			System.out.printf("%d번째 번호 > ",i+1);
			myBall[i]=scan.nextInt();
		//5. ball배열 출력
		}
		System.out.println("입력번호 : ");
		
		for(int i=0;i<6;i++) {
			System.out.printf("%4d ",myBall[i]);
		}
		System.out.println();
		
		System.out.println("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%4d ",ball[i]);
		}
		
		//6. 당첨개수
		int[] lotto=new int[6];
		int cnt=0;
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (ball[i]==myBall[j]) {
					lotto[cnt]=ball[i];
					cnt+=1; break;
				}
			}
		}
		System.out.printf("당첨개수 : %d\n",cnt);
		System.out.printf("당첨번호 : ");
		for (int i=0;i<cnt;i++) {
			System.out.printf("%4d",lotto[i]);
		}
		if(cnt==0)System.out.println("없음");
	}

}
