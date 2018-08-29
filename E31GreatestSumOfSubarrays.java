package swordToOffer;

public class E31GreatestSumOfSubarrays {

	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length==0)
			return 0;
		int sumMax=array[0];
		int currentMax=array[0];//�������������֮��
		for(int i=1;i<array.length;i++){
			if(currentMax<0)//�������֮��һ��С���㣬��������¿�ʼ���������
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
