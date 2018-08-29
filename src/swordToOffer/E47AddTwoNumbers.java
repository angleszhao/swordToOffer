package swordToOffer;

public class E47AddTwoNumbers {

	public int add(int num1,int num2) {
		int sum,carry;
		do{
			sum=num1^num2;
			carry=(num1&num2)<<1;
			num1=sum;
			num2=carry;
		}while(num2!=0);
		return sum;
	}

	public static void main(String[] args) {
		E47AddTwoNumbers test=new E47AddTwoNumbers();
		System.out.println(test.add(3, 20));
	}
}
