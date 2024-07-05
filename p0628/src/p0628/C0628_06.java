package p0628;

import java.util.ArrayList;

public class C0628_06 {

	public static void main(String[] args) {
		ArrayList<Students> list=new ArrayList<Students>();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",100,100,99));
		list.add(new Students("이순신",100,100,99));
		list.add(new Students("김구",100,100,99));
		list.add(new Students("홍길동",100,100,99));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
/*
 		List : 순서가있는 데이터의 집합, 중복허용
 		Set : 순서가 없는 데이터의 집합, 중복허용 안함
 		Map : key 와 value 의 쌍으로 이루어진 데이터의 집합
 			  순서유지 x, key 중복 x, value 중복 O 
 			  ex) Id & pw
 */
		
		/* 3번
		ArrayList list=new ArrayList();
		list.add(new Card(1,"SPADE"));
		list.add(new Card(2,"DIAMOND"));
		list.add(new Card(3,"HEART"));
		list.add(new Card(4,"CLOVER"));
		  
		for(int i=0;i<list.size();i++) {
			Card c=(Card)list.get(i);
			System.out.println(c.number+","+c.kind);
		} */
		 
		
		/*   2번
		ArrayList list=new ArrayList();
		list.add("홍길동");
		list.add("유관순");
		list.add("이순신");
		list.add("김구");
		list.add("강감찬");
		
		list.remove(1); //index를 가지고 유관순 삭제
		list.remove("김구"); //객체형태로 삭제
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}  */
		
		
		/*   1번
		ArrayList  list=new ArrayList(); //List 순서O 중복O
		list.add(1); //add 명령어 추가
		list.add(2);
		list.add(3);
		list.add(1);
		list.remove(1); //ㅅ삭제 메소드
		
		// size() :  컬렉션 크기
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //get : 데이터를 읽어옴.
		} */
	}

}
