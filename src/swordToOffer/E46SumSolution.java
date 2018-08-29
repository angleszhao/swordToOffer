package swordToOffer;

public class E46SumSolution {

	public int Sum_Solution(int n) {
		int sum=n;
		boolean s=(n>0 &&(sum+=Sum_Solution(n-1))>0);
		return sum;
	}

	public static void main(String[] args) {
		E46SumSolution test=new E46SumSolution();
		System.out.println(test.Sum_Solution(5));
	}
}
