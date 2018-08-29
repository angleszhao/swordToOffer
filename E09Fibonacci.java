package swordToOffer;

public class E09Fibonacci {

	public E09Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	//ตÝน้
	public int fab_recursion(int n){
		if(n==0||n==1)
			return n;
		else
			return fab_recursion(n-1)+fab_recursion(n-2);
	}
	
	public int fab_iteration(int n){
		int first=0;
		int second=1;
		int result=0;
		if(n==1||n==0)
			return n;
		else{
			for(int i=2;i<=n;i++){
				result=first+second;
				first=second;
				second=result;
			}
			return result;
		}
	}

}
