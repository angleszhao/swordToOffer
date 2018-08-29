package swordToOffer;

public class E45LastNumberInCircle {

	public int lastRemaining(int n,int m){
		if(n<1||m<1)
			return -1;
		int last=0;
		for(int i=2;i<=n;i++){
			last=(last+m)%i;
		}
		return last;
	}

	public static void main(String[] args) {
		E45LastNumberInCircle test=new E45LastNumberInCircle();
		System.out.println(test.lastRemaining(5, 3));
	}
}
