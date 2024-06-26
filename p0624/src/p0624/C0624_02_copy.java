package p0624;

import java.util.Arrays;

public class C0624_02_copy {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		System.out.println("arr:"+Arrays.toString(arr));
		
		int[] arr2=null;
		arr2=arr; //복사 -> 이렇게 복사하면 안됨. arr2에 데이터는 들어감.
		
		System.out.println("arr2:"+Arrays.toString(arr2)); //1,2,3
		arr2[0]=1000; //이렇게 하면 arr2 뿐만아니라 arr도 바껴버림.
		
		System.out.println("arr2 2번째:"+Arrays.toString(arr2));//1000,2,3
		System.out.println("arr 2번째:"+Arrays.toString(arr));//1000,2,3
	}

}
