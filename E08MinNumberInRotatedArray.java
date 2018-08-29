package swordToOffer;

public class E08MinNumberInRotatedArray {
	/**
	 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ��ת��
	 * ����һ������������������һ����ת�������ת�������СԪ�ء�
	 * ���������3��4��5��1��2��Ϊ{1,2,3,4,5}��һ����ת�����������СԪ��Ϊ1.
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
