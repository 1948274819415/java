package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {
	{//초기화블럭
		count++;
		//S20240001;
		Date d = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy");
		this.stuNo="S"+sdf.format(d)+String.format("%03d", count);
	}
	//생성자
	Stu_score(){}
	
//	Stu_score(){} //이렇게 만들어야 함(=기본생성자) -> if 정의 안되어있으면 자동으로 만들어줌
	//매개변수 생성자
	Stu_score(String name,int kor,int eng,int math){ //매개변수 3개를 받는 생성자
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		total=kor+eng+math;
		avg=total/3.0;
	}
	static int count; //클래스변수:모든 객체가 공통으로 사용
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}
