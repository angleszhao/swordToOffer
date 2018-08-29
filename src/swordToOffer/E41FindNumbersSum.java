package swordToOffer;

public class E41FindNumbersSum {

	public void findNumsWithSum(int[] arr,int target) {
		if(arr==null)
			return;
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int sum=arr[start]+arr[end];
			if(sum==target){
				System.out.println(arr[start]+" , "+arr[end]);
				break;
			}else if(sum>target){
				end--;
			}else{
				start++;
			}
		}
	}
	public void findNumsWithSeq(int target){
		if(target<3)
			return;
		int small=1;
		int big=2;
		while(small<(target+1)/2){
			int sum=0;
			for(int i=small;i<=big;i++){
				sum+=i;
			}
			if(sum==target){
				for(int i=small;i<big;i++)
					System.out.print(i+"+");
				System.out.print(big);
				System.out.println();
				small++;
			}else if(sum<target){
				big++;
			}else{
				small++;
			}
		}
	}
	public static void main(String[] args) {
		E41FindNumbersSum test=new E41FindNumbersSum();
		int[] arr={1,2,4,7,11,15};
		int target=15;
		test.findNumsWithSum(arr, target);
		System.out.println("------------------------");
		test.findNumsWithSeq(target);
	}

}
