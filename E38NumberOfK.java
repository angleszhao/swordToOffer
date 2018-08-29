package swordToOffer;

public class E38NumberOfK {

	private int getFirst(int[] arr, int k, int left, int right) {
		if(left>right)
			return -1;
		int middleindex=(left+right)/2;
		int middledata=arr[middleindex];
		if(middledata==k){
			if((middleindex>0&& arr[middleindex-1]!=k) || middleindex==0)
				return middleindex;
			else
				right=middleindex-1;
		}else if(middledata>k){
			right=middleindex-1;
		}else
			left=middleindex+1;
		return getFirst(arr, k, left, right);
	}
	private int getLast(int[] arr, int k, int left, int right) {
		if(left>right)
			return -1;
		int middleindex=(left+right)/2;
		int middledata=arr[middleindex];
		if(k==middledata){
			if((middleindex<arr.length-1 && arr[middleindex+1]!=k) || middleindex==(arr.length-1))
				return middleindex;
			else
				left=middleindex+1;
		}else if(middledata>k){
			right=middleindex-1;
		}else{
			left=middleindex+1;
		}
		return getLast(arr, k, left, right);
	}
	public int getNumberOfK(int[] arr,int k) {
		int number=0;
		if(arr.length>0){
			int first=getFirst(arr,k,0,arr.length-1);
			int last=getLast(arr,k,0,arr.length-1);
			if(first>-1&&last>-1)
				number=last-first+1;
		}
		return number;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,3,3,4,5};
		E38NumberOfK test = new E38NumberOfK();
		System.out.println(test.getNumberOfK(arr, 3));
	}
}
