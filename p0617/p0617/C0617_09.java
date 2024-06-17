package p0617;

public class C0617_09 {

	public static void main(String[] args) {
		String str="안녕";
		String str2="안녕2";
		String str3=new String("안녕"); 
		// ---
		System.out.println("str:"+str);
		System.out.println("str3:"+str3);
		// --- 둘 다 안녕이 나오긴 함.근데 "다른 문자"라고 나옴
		int num=5;
		int num2=5;
		if(num==num2) {
			System.out.println("같은 숫자");
		}else {
			System.out.println("다른 숫자");
		}
		
		// 문자열, 참조변수 비교는 ==비교가 안됨. equals 메소드 사용해야 함
		if (str.equals(str3)) {
			System.out.println("같은 문자"); // 쓰면 이거 나옴
		}else {
			System.out.println("다른 문자"); // equals 안쓰면 이거 나옴
		}
		// ---
		System.out.println("--------------------");
		if (str3=="안녕") {
			System.out.println("같은 문자");
		}else {
			System.out.println("다른 문자"); // 같은 문자인데 다른 문자라고 나옴!
		}
	}

}
