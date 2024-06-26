package p0624;

public class C0624_09_Car {

	public static void main(String[] args) {
		/*
		Data d=new Data();//에러없음
		Data2 d2=new Data2(); //error--->Data2(){} 기본생성자 넣어주면 됨/
		
		Data2 d3=new Data2(10); //에러 없음
		*/
		
		//객체 선언 후 white, auto, 4
		//객체 선언 후 red, auto, 5
		//객체 선언 후 blue, auto, 3
		//-----------------------------------
		Car c1=new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);		
		//-----------------------------------
		Car c=new Car("white","auto",4); //한줄로 줄일 수 있음.
		//-----------------------------------		
		Car c2=new Car();
		c2.color="red";
		c2.gearType="auto";
		c2.door=5;
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2);
		//-----------------------------------
		Car cc=new Car("red","auto",5);
		//-----------------------------------
		Car c3=new Car();
		c3.color="blue";
		c3.gearType="auto";
		c3.door=3;
		//-----------------------------------
		Car ccc=new Car("blue","auto",3);
	}

}
