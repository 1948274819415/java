package p0627;

public class C0627_03 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try { //안에서 예외가 발생하지 않으면 catch 문 돌지않음.
			System.out.println(3);
			System.out.println(0/0); //일부러 error
			System.out.println(4); //실행 x
		}catch(Exception e) { //try 문에서 에러나면 catch 문으로 옴.
			System.out.println(5);

		}
		System.out.println(6);
		
	}
}
