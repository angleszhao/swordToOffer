package swordToOffer;

public class E33SortArrayForMinNumber {

	public void printMin(int[] arr){
		int[] clone=arr.clone();
		printMinNumber(clone,0,clone.length-1);
		for(int i:clone)
			System.out.print(i);
	}

	private void printMinNumber(int[] arr, int left, int right) {
		if(left<right){
			int main_number=arr[right];
			int small_cur=left;
			for(int j=left;j<right;j++){
				if(isSmall(String.valueOf(arr[j]), String.valueOf(main_number))){
					int temp=arr[j];
					arr[j]=arr[small_cur];
					arr[small_cur]=temp;
					small_cur++;
				}
			}
			arr[right]=arr[small_cur];
			arr[small_cur]=main_number;
			printMinNumber(arr, 0, small_cur-1);
			printMinNumber(arr, small_cur+1, right);
		}
		
	}
	public boolean isSmall(String m,String n){
		String left=m+n;
		String right=n+m;
		boolean res=false;
		for(int i=0;i<left.length();i++){
			if(left.charAt(i)<right.charAt(i))
				return true;
			else{
				if(left.charAt(i)>right.charAt(i))
					return false;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {3,32,321};
		E33SortArrayForMinNumber test = new E33SortArrayForMinNumber();
		test.printMin(arr);
	}
}
