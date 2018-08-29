package swordToOffer;

import java.util.Arrays;

public class E30KLeastNumbers {

	public void HeapSort(int[] arr){
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--){
			adjustHeap(arr,i,n-1);
		}
		
		for(int i=n-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			adjustHeap(arr,0,i-1);
		}
	}

	public void adjustHeap(int[] arr, int start, int end) {
		int temp=arr[start];
		int j=2*start;
		for(;j<end;j*=2){
			if(j<end&&arr[j]>arr[j+1])
				j=j+1;
			if(arr[j]<temp){
				arr[start]=arr[j];
				start=j;
			}else{
				break;
			}
		}
		arr[start]=temp;
	}
	public int[] getLeastNumbers(int[] arr,int k){
		if(arr==null || k<0 || k>arr.length)
			return null;
		int[] karr=new int[k];
		karr=Arrays.copyOfRange(arr, 0,k);
		HeapSort(karr);
		System.out.println();
		for(int i=k;i<arr.length;i++){
			if(arr[i]<karr[0]){
				karr[0]=arr[i];
				System.out.println("adjustheap......");
				HeapSort(karr);
			}
		}
		return karr;
	}
	public static void main(String[] args) {
		E30KLeastNumbers test=new E30KLeastNumbers();
		int[] arr={4,5,1,6,2,7,3,8};//{4,76,8,12,9,5,7,3,58};
		/*test.HeapSort(arr);
		for(int a:arr){
			System.out.print(a+" ; ");
		}*/
		int[] karr=test.getLeastNumbers(arr, 3);
		for(int a:karr){
			System.out.print(a+" ; ");
		}
	}

}
