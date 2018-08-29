package swordToOffer;

public class E36InversePairs {

	public int MergeSort(int[] arr,int start,int end) {
		int count=0;
		if(start>=end)
			return 0;
		int middle=(start+end)/2;
		count+=MergeSort(arr,start,middle);
		count+=MergeSort(arr, middle+1, end);
		count+=Merge(arr,start,middle,end);
		return count;
	}
	public int Merge(int[] arr,int left,int middle,int right){
		int count=0;
		int center=middle+1;
		int[] temparr=new int[arr.length];
		int tempindex=left;
		int start=left;
		while(left<=middle && right>=center){
			if(arr[left]<arr[center]){
				temparr[tempindex++]=arr[left++];
			}else{
				temparr[tempindex++]=arr[center++];
				count+=middle-left+1;
			}
		}
		while(left<=middle){
			temparr[tempindex++]=arr[left++];
		}
		while(center<=right){
			temparr[tempindex++]=arr[center++];
		}
		for(int i=start;i<=right;i++){
			arr[i]=temparr[i];
		}
		return count;
	}

	public static void main(String[] args) {
		E36InversePairs test=new E36InversePairs();
		int[] arr={7,5,6,4};
		System.out.println(test.MergeSort(arr, 0, arr.length-1));
		for(int a:arr)
			System.out.println(a);
	}
}
