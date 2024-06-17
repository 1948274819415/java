package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// 숫자를 입력받아 60점 이상 합격, 미만 불합격
		// 90이상 A,80이상 B,...,60이상 D, 그외 F
		System.out.println("점수 입력");
		int num=scan.nextInt();
		if (num>=90) {
			System.out.println("A");
		}else if(num>=80){
			System.out.println("B");
		}else if(num>=70){
			System.out.println("C");
		}else if(num>=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		} //else
	} //main

} //class
