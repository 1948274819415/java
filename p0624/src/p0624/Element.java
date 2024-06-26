package p0624;

public class Element {
	void allCal(int a,int b,int[]result) { //배열도 같이 
		result[0]=a+b;
		result[1]=a-b;
		result[2]=a*b;
		result[3]=a/b;
	}
	/*
	int cal(int a,int b) {
		int result=a+b;
		return result; //return 2개는 못넘김
	}
	int minus(int a,int b) {
		int result=a-b;
		return result;
	}
	int multi(int a,int b) {
		int result=a*b;
		return result;
	}
	int divide(int a,int b) {
		int result=a/b;
		return result;
	} ------------------------> 연산자만 바뀔 뿐 똑같은데 반복해야 함.--> 배열만듦
	*/ 
}
