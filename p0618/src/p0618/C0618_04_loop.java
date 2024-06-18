package p0618;

public class C0618_04_loop {

	public static void main(String[] args) {
		// 구구단 - 4단에 4단까지만 
		loop1:for (int i=2;i<=9;i++) {
			System.out.printf("[ %d단 ]",i,"\n");
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
				if (i==4 && j==4) {
					break loop1;
				}
			}
		}

	}

}
