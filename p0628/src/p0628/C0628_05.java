package p0628;

public class C0628_05 {

	public static void main(String[] args) {
		// [String]
		String str="123";
		str=str+"12";
		
		// [StringBuffer]
//		StringBuffer sb="123"; ---> error
		StringBuffer sb=new StringBuffer("123");
//		sb=sb+"12"; ---> error
		sb.append("12"); // "123"+"12"
	}

}
