package swordToOffer;

public class E28StringPermutation {

	public void swap(char[] arr,int idx1,int idx2){
		char temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	public void permutation(char[] arr,int index,int size){
		if(index==size){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		else{
			for(int i=index;i<size;i++){
				if(i!=index && arr[i]==arr[index])
					continue;
				swap(arr,i,index);
				permutation(arr, index+1, size);
				swap(arr,i,index);
			}
		}
	}
	public static void main(String[] args) {
		String str="abcd";
		char[] chs=str.toCharArray();
		E28StringPermutation test=new E28StringPermutation();
		test.permutation(chs,0, chs.length);
	}

}
