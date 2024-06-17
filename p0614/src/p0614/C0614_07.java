package p0614;

public class C0614_07 {
	public static void main(String[] args) {
		System.out.println(10.0f/3); //3.3333333 소숫점 7자리까지만 정확함, 자동 줄바꿈
		System.out.printf("%.2f\n",10.0/3); //3.33 둘째까지 표현할수있음, \n넣어야 줄 바뀜
		int x=0x1a; //16진수 표현 1a값은? (1*16^1)+(a*16^0)
		System.out.println("x : "+x);
		System.out.printf("%X",x); //1A - 
		// printf :
		// - 16진수 출력가능
		// - 소수점 제한 출력가능
		
		long a=10L;
		System.out.printf("%d\n",a); //1A10
		
		int b=20;
		System.out.printf("%d\n",b); //20
		
		int age=10;
		int year=2014;
		System.out.printf("나이 : %d, 연도 : %d\n",age,year); //나이 : 10, 연도 : 2014
		System.out.println("나이 : "+age+"세, 연도 : "+year+"년");
		
		System.out.printf("[%5d] \n",10); //[   10]
		System.out.printf("[%05d] \n",10); //[00010] 
		
		
	}
}
