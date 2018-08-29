package swordToOffer;
//https://blog.csdn.net/yi_afly/article/details/52012593
public class E32NumberOf1 {

	public int count1(int n) {
		if(n<1)
			return 0;
		int count=0;
		int base=1;
		int round=n;
		while(round>0){
			int weight=round%10;
			round=round/10;
			count=count+round*base;
			if(weight==1)
				count=count+(n%base)+1;
			else if(weight>1)
				count=count+base;
			base*=10;
		}
		return count;
	}

	public static void main(String[] args) {
		E32NumberOf1 test=new E32NumberOf1();
		System.out.println(test.count1(534));
	}
}
