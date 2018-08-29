package mergesort;

import java.util.Scanner;

public class FoundPairs {

	public FoundPairs() {
		// TODO Auto-generated constructor stub
	}

	static int ans=0;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (scanner.hasNext()){
			int n=scanner.nextInt();
			int[] arr=new int[n];
			int[] temp=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scanner.nextInt();
			}
			mergeSort(arr,0,n-1);
			for(int a:arr)
			System.out.println(a);
			System.out.println("ans : "+ans);
		}
		scanner.close();
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if(left>=right)
			return;
		int middle=(left+right)/2;
		mergeSort(arr,left,middle);
		mergeSort(arr,middle+1,right);
		Merge(arr,left,middle,right);
	}
	public static void Merge(int[] arr,int low,int middle,int high){
		int index=low;
		int[] tempArr=new int[arr.length+1];
		int center=middle+1;
		int start=low;
		while(low<=middle && center<=high){
			if(arr[low]<=arr[center])
				tempArr[index++]=arr[low++];
			else{
				tempArr[index++]=arr[center++];
				ans+=middle-low+1;
			}
		}
		while(low<=middle){
			tempArr[index++]=arr[low++];
		}
		while(center<=high){
			tempArr[index++]=arr[center++];
		}
		for(int i=start;i<=high;i++){
			arr[i]=tempArr[i];
		}
	}
}
