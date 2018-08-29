package swordToOffer;

public class E31GreatestSumOfSubarrays {

	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length==0)
			return 0;
		int sumMax=array[0];
		int currentMax=array[0];//保存子数组相加之和
		for(int i=1;i<array.length;i++){
			if(currentMax<0)//若是相加之和一旦小于零，子数组从新开始，否则相加
				currentMax=array[i];
			else{
				currentMax=currentMax+array[i];
			}
			if(currentMax>sumMax)
				sumMax=currentMax;
		}
		return sumMax;
	}

}
