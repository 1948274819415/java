package p0614;

public class C0614_03 {
	public static void main(String[] args) {
//		System.out.println(); //sysout 쓰고 ctrl+spacebar
		boolean power=true;
		char ch='A';
		System.out.println(ch);
		char ch2='\u0041';
		System.out.println(ch2); // A 출력
		char ch3='A';
		System.out.println((int)ch3);
		
		int a=65; // 아스키코드 65=대문자 A
		System.out.println(a); //65
		System.out.println((char)a); //A - 아스키코드
		
		int hex=0x100;
		System.out.println(hex); //256
		
		// 3.14e3f -->3.14*10^3 = 3140.0f
		// 1e1 --> 10.0 = e가 있으면 소숫점임  
		
	} //main쓰고 ctrl+spacebar 누름 됨
	
}
