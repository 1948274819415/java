package p0617;

public class C0617_05 {

	public static void main(String[] args) {
		float pi=3.141592f;
		System.out.println(pi*1000/1000); //3.141592
		System.out.println((int)(pi*1000)/1000f); //3.141
		// (int)3141.592 -> 3141
		// 3141/1000f -> 3.141
		
		System.out.println(Math.round(pi*1000)/1000f);
		// Math.round(3141.592)
		// 반올림 결과 : 3142
		// 3142/1000f -> 3.142
		
		int a=10;
		int b=10;
		System.out.println(a!=b);
	}

}
