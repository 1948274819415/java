package p0619;

import java.util.Arrays;

public class C0619_05 {

	public static void main(String[] args) {
		
		// 5,5 배열 생성 후 1~25번호 입력, 랜덤셔플 후 출력
		int[][] ary=new int[5][5];
		for (int i=0;i<5;i++) {
			for (int j=0; j<5;j++) {
				System.out.println(ary[i][j]+"\t");
			}
		}
		System.out.println(Arrays.toString(ary));

	}

}
