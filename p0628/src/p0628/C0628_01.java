package p0628;

public class C0628_01 {

	public static void main(String[] args) {
//		int a=0;
		String a="0";//더하기 할때마다 새로운 공간을 만듦. -> 메모리 낭비가 심함
		for (int i=0;i<5;i++) {
			a=a+1;
		}
		System.out.println(a);
		
//		char ch=''; //error
		char ch=' ';//띄워야 가능 
		
		String str="";//가능
		String str2=" "; //얘도 가능

	}

}
