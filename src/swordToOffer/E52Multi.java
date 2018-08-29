package swordToOffer;
//https://blog.csdn.net/rebirth_love/article/details/51612096
public class E52Multi {

	public int[] multiply(int[] arr){
		int[] brr=new int[arr.length];
		brr[0]=1;
		for(int i=1;i<arr.length;i++){
			brr[i]=brr[i-1]*arr[i-1];
		}
		int temp=1;
		for(int j=arr.length-2;j>=0;j--){
			temp=temp*arr[j+1];
			brr[j]*=temp;
		}
		return brr;
	}

	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		E52Multi test=new E52Multi();
		int[] brr=test.multiply(arr);
		for(int i:brr){
			System.out.println(i);
		}
	}
}
