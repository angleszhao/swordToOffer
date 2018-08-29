package swordToOffer;

public class E29MoreThanHalfNumber {

	public int moreThanHalfNumber(int[] arr) {
		if(arr.length<=0)
			return -1;
		int result=arr[0];
		int times=1;
		for(int i=1;i<arr.length;i++){
			if(times==0){
				result=arr[i];
				times=1;
			}else if(arr[i]==result){
				times++;
			}else{
				times--;
			}
		}
		if(times<=0)
			result=-1;
		return result;
	}

	public static void main(String[] args) {
		int[] arr={1,2,3,2,2,2,5,4,2,2};
		E29MoreThanHalfNumber test=new E29MoreThanHalfNumber();
		System.out.println(test.moreThanHalfNumber(arr));
	}
}
