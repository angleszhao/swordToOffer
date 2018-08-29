package swordToOffer;

public class E14ReorderArray {

	public E14ReorderArray() {
		// TODO Auto-generated constructor stub
	}
	public void orders(int[] arr){
		if(arr==null)
			return;
		int i=0;
		int j=arr.length-1;
		while(i<j){
			if(isEven(arr[i])&& !isEven(arr[j])){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}else if(!isEven(arr[i]) && !isEven(arr[j])){
				i++;
			}else if(isEven(arr[i]) && isEven(arr[j])){
				j--;
			}else{
				i++;
				j--;
			}
			System.out.println("i="+i+" ; j="+j);
		}
		
	}
	
	public boolean isEven(int n){
		return (n&1)==0;//true为偶数，false为奇数
	}
	public static void main(String[] args) {
		E14ReorderArray test =new E14ReorderArray();
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,14,16,15,19,21};
		test.orders(arr);
		for(int k = 0;k<arr.length ;k++){
			System.out.print(arr[k]+",");
		}
	}

}
