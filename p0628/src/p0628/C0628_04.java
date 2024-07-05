package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) {//abcdeakabcdefga
		Scanner scan=new Scanner(System.in);
		System.out.println("문자입력 : ");
		String search=scan.nextLine();
		
		String str="abcdeakabcdefga";
		System.out.println("해당 문자열:"+str);
		int count=0;
		while(true) {
			int num=0;
			num=str.indexOf(search);
			if(num==-1) {
				System.out.println("찾는 문자열이 더이상 없습니다.");
				break;
			}else {
				count++;
				str=str.substring(num+1);
			}
		}
		
		System.out.printf("%s 찾는 문자열 개수:%d\n",search,count);
	}

}
