package swordToOffer;

public class E10NumberOfOne {

	public E10NumberOfOne() {
		// TODO Auto-generated constructor stub
	}
	public int numbers(int num){
		int count=0;
		while(num!=0){
			count++;
			num=num&(num-1);
		}
		return count;
	}

	public static void main(String[] args) {
		E10NumberOfOne test=new E10NumberOfOne();
		System.out.println(test.numbers(11));
	}
}
