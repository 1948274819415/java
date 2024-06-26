package p0624;

public class Car {
	static int count=0;
	String serial_no;
	String color;
	String gearType;
	int door;
	//초기화 블럭-생성자를 호출하기 전에 먼저 실행시켜줌.
	{
		count+=1;
		this.serial_no="HD"+String.format("%04d", count);
	}
	
	Car(){}//기본생성자
	
	Car(String color){
		this.color=color;
		
	};//오버로딩
	
	Car(String color,String gearType,int door){
		this.color=color; //this 는 참조변수를 가르킴
		this.gearType=gearType;
		this.door=door;
		count+=1;}
}
