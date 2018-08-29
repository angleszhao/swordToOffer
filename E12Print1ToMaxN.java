package swordToOffer;

import java.util.ArrayList;
import java.util.Iterator;

public class E12Print1ToMaxN {

	public E12Print1ToMaxN() {
		// TODO Auto-generated constructor stub
	}

	// 输出数字，将高位的0舍掉
	public void output(ArrayList<Integer> nlist){
		Iterator<Integer> it=nlist.iterator();
		int num;
		// 找到第一个为0的位置
		boolean first=false;
		while(it.hasNext()){
			if(first){
				System.out.print(it.next());
				continue;
			}
			if((num=it.next())!=0){
				first=true;
				System.out.print(num);
			}
			
		}
		System.out.println();
	}
	public void outputOneToMax(int n){
		ArrayList<Integer> nlist=new ArrayList<>();
		for(int i =0;i<n;i++){
			nlist.add(0);
		}
		increatment(nlist);
	}
	public void increatment(ArrayList<Integer> nlist){
		int carrybit=0;
		boolean end=false;
		while(true){
			for(int i=nlist.size()-1;i>=0;i--){
				int digit=nlist.get(i);
				int sum=digit+carrybit;
				if(i==(nlist.size()-1)){
					sum+=1;
				}
				if(sum>=10){
					if(i==0){
						end=true;
					}
					sum=sum-10;
					carrybit=1;
				}else{
					carrybit=0;
				}
				nlist.set(i, sum);
			}
			output(nlist);
			if(end)
				break;
		}
	}
	
	public static void main(String[] args) {
		E12Print1ToMaxN test=new E12Print1ToMaxN();
		test.outputOneToMax(2);
	}
}
