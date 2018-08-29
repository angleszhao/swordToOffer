package swordToOffer;

public class E43DicsProbability {

	public void printProbability(int number) {
		if(number<1)
			return;
		int g_maxvalue=6;
		int[][] probabilities=new int[2][];
		probabilities[0]=new int[g_maxvalue*number+1];
		probabilities[1]=new int[g_maxvalue*number+1];
		int flag=0;
//		probabilities[0][0]=0;
//		probabilities[1][0]=0;
		for(int i=1;i<=g_maxvalue;i++)
			probabilities[0][i]=1;
		for(int k=2;k<=number;k++){
			for(int i=0;i<=g_maxvalue*k;i++){
				if(i<k)
					probabilities[1-flag][i]=0;//k个骰子和至少为k，不会小于k
				else{
					probabilities[1-flag][i]=0;
					for(int j=1;j<=i && j<=g_maxvalue;j++){
						probabilities[1-flag][i]+=probabilities[flag][i-j];
					}
				}
			}
			flag=1-flag;
		}
		double total=Math.pow(g_maxvalue, number);
		for(int i=number;i<=g_maxvalue*number;i++){
			double ratio=(double)probabilities[flag][i]/total;
			System.out.println(i+" : "+ratio);
		}
	}
	public static void main(String[] args) {
		E43DicsProbability test=new E43DicsProbability();
		test.printProbability(2);
	}

}
