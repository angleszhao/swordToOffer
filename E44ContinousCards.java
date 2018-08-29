package swordToOffer;

import java.util.Arrays;

public class E44ContinousCards {

	public boolean isContinous(int[] arr,int k) {
		boolean res=false;
		if(arr==null || arr.length!=k)
			return false;
		Arrays.sort(arr);
		int numberOfZero=0;
		int numberOfGap=0;
		for(int i=0;i<k &&arr[i]==0;i++){
				numberOfZero++;
		}
		int small=numberOfZero;
		int big=small+1;
		while(big<k){
			if(arr[small]==arr[big])
				return false;//same
			numberOfGap+=arr[big]-arr[small]-1;
			small=big;
			big++;
		}
		res=numberOfZero>=numberOfGap?true:false;
		return res;
	}

	public static void main(String[] args) {
		E44ContinousCards test=new E44ContinousCards();
		int[] arr={0,0,1,3,5};
		System.out.println(test.isContinous(arr, 5));
	}
}
