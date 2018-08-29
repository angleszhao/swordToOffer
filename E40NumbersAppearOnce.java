package swordToOffer;

public class E40NumbersAppearOnce {

	public int findFirstBitIs1(int number){
		int indexBit=0;
		while((number & 1)==0){
			number=number>>1;
			indexBit++;
		}
		return indexBit;
	}
	public boolean isBit1(int number,int index){
		number=number>>index;
		return (number&1)==0;
	}
	public void FindNumbersAppearOnce(int[] arr) {
		if(arr==null)
			return;
		int number=0;
		for(int i:arr)
			number^=i;
		int index=findFirstBitIs1(number);
		int number1=0,number2=0;
		for(int i:arr){
			if(isBit1(i, index))
				number1^=i;
			else
				number2^=i;
		}
		System.out.println(number1);
		System.out.println(number2);
	}

	public static void main(String[] args) {
		int[] arr={6,2,4,3,3,2,5,5};
		E40NumbersAppearOnce test = new E40NumbersAppearOnce();
		test.FindNumbersAppearOnce(arr);
	}
}
