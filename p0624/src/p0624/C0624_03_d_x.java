package p0624;

public class C0624_03_d_x {

	public static void main(String[] args) {
		//참조형 매개변수
		Data d=new Data();
		d.x=10;
		System.out.println("d.x:"+d.x);//10
		
		change(d);
		System.out.println("d.x:"+d.x); //1000
		for(int i=0;i<10;i++) {
			
		} //----> 이것과
		for(int i=5;i<10;i++) {
			
		}//이게 다른것처럼
	}//method 얘랑 
	
	static void change(Data d) {
		d.x=1000;
		System.out.println("change x:"+d.x); //1000
	}//method 얘도 다름

}
