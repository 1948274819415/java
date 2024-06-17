package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		
		byte b=127;
//		byte b2=128; --> 127까지만 되삼
		b=(byte)(b+10);
		System.out.println(b); //-119 : 127+10=127이 끝이니까 -127로 다시 내려감 = 오버플로우
		
		int num=2147483647;
		num=num+1;
		System.out.println(num); //얘도 오버플로우 -(마이너스)로 되돌아감
		
		
		
		
		// TODO Auto-generated method stub
		char ch='A'; //문자 2개이상 안됨
		char ch2=' '; //띄어쓰기 없으면 안됨
		String str="AA";
		String str2="";
		String str3=null; // String은 다 됨
		
		String s1="A"+"B";
		System.out.println(s1); //AB
		System.out.println(""+7+7+7); //777 : 문자열+any type=문자열로 변경됨
		System.out.println(7+7+7+""); //21 : 숫자로 더해졌지만 type은 문자삼
		System.out.println(7+7+7+""+7); //217 : 이일칠 이라고 읽음. '7'은 문자니까 
	}

}
