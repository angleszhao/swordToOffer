package swordToOffer;

public class E34UglyNumber {

	//solution1
	public boolean isUgly(int number){
		while(number % 2 == 0)
			number/=2;
		while(number % 3 == 0)
			number /=3;
		while(number % 5 == 0)
			number /=5;
		return (number ==1)? true:false;
	}
	public int getUglyNumber1(int index){
		if(index <= 0)
			return 0;
		int number = 0;
		int uglyFound = 0;
		while(uglyFound < index){
			number++;
			if(isUgly(number)){
				++uglyFound;
			}
		}
		return number;
	}
	//solution2
	public int min(int num1,int num2,int num3) {
		int min=num1<num2?num1:num2;
		min=min<num3?min:num3;
		return min;
	}
	public int getUglyNumber(int index){
		if(index<=0)
			return 0;
		int[] uglyarr=new int[index];
		uglyarr[0]=1;
		int uglymul2=0;
		int uglymul3=0;
		int uglymul5=0;
		for(int i=1;i<index;i++){
			int temp=min(uglyarr[uglymul2]*2,uglyarr[uglymul3]*3,uglyarr[uglymul5]*5);
			uglyarr[i]=temp;
			while(temp==uglyarr[uglymul2]*2)
				uglymul2++;
			while(temp==uglyarr[uglymul3]*3)
				uglymul3++;
			while(temp==uglyarr[uglymul5]*5)
				uglymul5++;
		}
		return uglyarr[index-1];
	}

	public static void main(String[] args) {
		E34UglyNumber test=new E34UglyNumber();
		System.out.println(test.getUglyNumber(1500));
	}
}
