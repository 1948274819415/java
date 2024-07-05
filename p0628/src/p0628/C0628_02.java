package p0628;

import java.util.Arrays;

public class C0628_02 {

	public static void main(String[] args) {
		String str="HELLO";
		char ch=str.charAt(0);//지정한 위치에 있는 문자 1개 가져옴
		System.out.println(ch);
		
		String s="하이";
		String s2="나다";
		
		//concat : 문자열 합치기 갯수 많을때 씀.
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		
		//contains : 하 라는 문자가 들어있는지
		System.out.println(s.contains("하"));
		
		//endsWith : 지정된 문자로 끝나는지
		String e="abc.txt";
		System.out.println(e.endsWith("txt"));
		
		//length : 길이 확인
		String l="하이 반갑따고!!";
		System.out.println(l.length());
		
		//equalsIgnoreCase : 대소문자 구분 없이
		
		//replace : 문자열 중 해당 문자열을 다른 문자열로 교체
		String r="화면중지. 중지하려면 버튼클릭";
		String r2=r.replace("중지","stop");
		System.out.println(r);
		System.out.println(r2);
		
		//indexOf : 해당 문자열이 있으면 위치값 리턴, 없으면 -1 리턴
		String i="abcdefghijklmnop";
		System.out.println(i.indexOf("f")); //5
		System.out.println(i.indexOf("z")); //-1
		
		//subString
		String sub="abc aaa aac bbc bbb ccc";
		System.out.println(sub.length());
		System.out.println(sub.substring(8,15)); //8~15번까지 가져와라
		System.out.println(sub.substring(8)); //8번부터 끝까지 가져와라
		
		//split : 문자열을 분리자롷 나누어 문자열로 리턴
		String sp="국,영,수,사";
		String[] spArr=sp.split(",");
		System.out.println(Arrays.toString(spArr));
		String sp2="국/영/수/합";
		String[] spArr2=sp.split("/");
		System.out.println(Arrays.toString(spArr2));
		
		//trim : 문자열 앞,뒤 공백제거 : 문자열 내부공백은 제거하지않음
		String tr="     하이 반  갑다";
		System.out.println(tr);
		System.out.println(tr.trim());
		
		//모든공백제거
		System.out.println(tr.replace(" ",""));
		
		//
	}

}
