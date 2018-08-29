package swordToOffer;

public class E08MinNumberInRotatedArray {
	/**
	 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为旋转。
	 * 输入一个递增的排序的数组的一个旋转，输出旋转数组的最小元素。
	 * 例如数组｛3，4，5，1，2｝为{1,2,3,4,5}的一个旋转，该数组的最小元素为1.
	 */
	public E08MinNumberInRotatedArray() {
		// TODO Auto-generated constructor stub
	}
	public int minInReversingList(int[] arr){
		if(arr==null){
			return -1;
		}
		int leftIndex=0;
		int rightIndex=arr.length-1;
		int midIndex=leftIndex;
		while(arr[leftIndex]>=arr[rightIndex]){
			if(rightIndex-leftIndex<=1){
				midIndex=rightIndex;
				break;
			}
			midIndex=(leftIndex+rightIndex)/2;
			if(arr[leftIndex]==arr[rightIndex] && arr[midIndex]==arr[leftIndex]){
				return MinInOrder(arr,leftIndex,rightIndex);
			}
			if(arr[midIndex]>=arr[leftIndex]){
				leftIndex=midIndex;
			}else if(arr[midIndex]<arr[rightIndex]){
				rightIndex=midIndex;
			}
		}
		return arr[midIndex];
	}
	public int MinInOrder(int[] arr,int leftIndex,int rightIndex){
		int result=arr[leftIndex];
		for(int i=leftIndex+1;i<rightIndex;i++){
			if(result>arr[i])
				result=arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		E08MinNumberInRotatedArray test=new E08MinNumberInRotatedArray();
		int[] arr={1,1,1,0,1};//{3,4,5,1,2};
		System.out.println(test.minInReversingList(arr));
	}

}
