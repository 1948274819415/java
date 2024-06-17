package p0614;

public class C0614_06 {

	public static void main(String[] args) {
		float f=1.6f;
		int i=(int)f; // float -> int 타입변경
		System.out.println(i); //1
		
		int n=10;
		float f1=n;
		System.out.println(n); //10 I
		System.out.println(f1); //10.0 F
		
		int n2=65;
		char ch=(char)n2; //형변환
		System.out.println(ch); //A
		
		char ch2='a';
		int n3=ch2;
		System.out.println(n3); //97
		
		int n4=10;
		float f2=n4;
		System.out.println(f2); //10.0
		
	}

}
