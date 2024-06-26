package p0624;

public class Cal {
	int add(int a, int b,int c) { //add는 인스턴스 메소드
		int result=a+b+c;
		return result;
	}
	int add2(int[] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
}
