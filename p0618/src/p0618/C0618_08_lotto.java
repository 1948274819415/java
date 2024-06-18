package p0618;

import java.util.Scanner;

public class C0618_08_lotto {

	public static void main(String[] args) {
		//-----------------------------------------------------------
		// 로또번호 생성, 섞기, 6개 숫자 출력
		//-----------------------------------------------------------
		int[] num=new int[45]; // 로또번호 1~45
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		} // 로또배열 생성 -------------------
		
		int no=0; // 랜덤번호
		int temp=0; // 숫자 저장소
		
		for (int i=0;i<777;i++) {
			no=(int)(Math.random()*45);
			temp=num[0];
			num[0]=num[no];
			num[no]=temp;
		} // 랜덤섞기 -------------------

		Scanner scan=new Scanner(System.in);
		int[] myArr=new int[6];
		int num1=0;
		int n=0;
		System.out.println("      [ 로치로또 ]");
		while(n<6) {
			for (int i=0;i<6;i++) {
				System.out.printf(" > %d번째 숫자를 입력하세요. ",n+1);
				num1=scan.nextInt();
				if(num1<1 || num1>45) {
					System.out.println("1~45사이 숫자만 입력해주세요.");
					continue;
				}
				myArr[i]=num1;
				n++;
			}
		} //--------------------- 잘못 적으면 메세지 뜨게
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(num[i]+" ");
		}// 6개 출력 -------------------
		
		int[] chk=new int[6];
		for(int i=0;i<6;i++) {
			chk[i]=i+1;
		}
		//------------------------ 맞춘 번호 저장
		int count=0;
		for (int i=0;i<6; i++) {
			for (int j=0;j<6;j++) {
				if (myArr[i]==num[j]) {
					count++;
					chk[count]=myArr[i];
					break;
				
				}
			}
		}
		System.out.printf("\n맞춘 갯수: %d개\n",count);
		//------------------------- 맞춘갯수
//		System.out.print("\n일치하는 숫자: ");
//		if (count==0) {
//			System.out.println("없음");
//		}
//		for (int i=0;i<count;i++) {
//			System.out.println(chk[i]);
//		}
		//------------------------- 맞춘 번호
		// 당첨금 
		// 6개-100억, 5개-1억, 4개-100만원, 3개-1만원
		switch(count) {
		case 6:
			System.out.println(">>> 100억 당첨! <<<");
			break;
		case 5:
			System.out.println(">>> 1억 당첨! <<<");
			break;
		case 4:
			System.out.println(">>> 100만원 당첨! <<<");
			break;
		case 3:
			System.out.println(">>> 1만원 당첨! <<<");
			break;
		case 2: 
			System.out.println(">>> 100원 당첨! <<<");
			break;
		case 1: case 0:
			System.out.println(">>> 꽝ㅋㅋ <<<");
			break;
			
		}
		
//		for (int i=0;i<6;i++) {
//			System.out.println((int)(Math.random()*45)); //중복가능성 있음.
//		}
	}

}
