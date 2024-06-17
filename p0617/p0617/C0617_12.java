package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		//점수 입력받아 90점이상 A, ...60미만 F 출력
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력");
		int num=scan.nextInt();
		
		String score="";
		
		if (num>=90) {
			score="A";
			if (num>=97) {
				score=score+"+";
			}else if(num<97 && num>92) {
				score=score;
			}else if(num<=92) {
				score=score+"-";
			}
		}else if(num>=80) {
			score="B";
			if (num>=87) {
				score=score+"+";
			}else if(num<87 && num>82) {
				score=score;
			}else if(num<=82) {
				score=score+"-";
			}
		}else if(num>=70) {
			score="C";
			if (num>=77) {
				score=score+"+";
			}else if(num<77 && num>72) {
				score=score;
			}else if(num<=72) {
				score=score+"-";
			}
		}else if(num>=60) {
			score="D";
			if (num>=67) {
				score=score+"+";
			}else if(num<67 && num>62) {
				score=score;
			}else if(num<=62) {
				score=score+"-";
			}
		}else {
			score="F";
		}
		
		System.out.println("학점 : "+score);
	}

}
