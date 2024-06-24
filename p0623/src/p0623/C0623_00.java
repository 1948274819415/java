package p0623;

public class C0623_00 {

	public static void main(String[] args) {
		//c1:Heart,7 
		//c2:Spade,4
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		System.out.printf("모양:%s,숫자:%d\n",c1.kind,c1.number);
		System.out.printf("가로:%s,세로:%d\n",c1.width,c1.height);
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		System.out.printf("모양:%s,숫자:%d\n",c2.kind,c2.number);
		System.out.printf("가로:%s,세로:%d\n",c2.width,c2.height);

		Card.width=50;
		Card.height=80;
		System.out.printf("c1 가로:%s,c1 세로:%d\n",c1.width,c1.height);
		System.out.printf("c2 가로:%s,c2 세로:%d\n",c2.width,c2.height);
		
		
		
		

	}

}
