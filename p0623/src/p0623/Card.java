package p0623;

public class Card {
	//기본생성자
	Card(){ }
	Card(String kind,int number){
		this.kind=kind;
		this.number=number;
	}
	String kind;
	int number;
	static int width=100;
	static int height=250;
}
