package p0628;

import java.util.ArrayList;

public class C0628_09 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.remove(3); //4 삭제
		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i); //하면 다 지워져야 하는데 안지워짐. 왜!?자리를 채워넣기 때문
					//===> 거꾸로 해야함!
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //1~7
		}
		if(list.isEmpty()) {
			System.out.println("데이터 없음");
		}
	}

}
