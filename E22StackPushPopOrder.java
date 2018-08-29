package swordToOffer;

import java.util.Stack;

public class E22StackPushPopOrder {

	public boolean check(int[] pPush,int[] pPop){
		boolean res=false;
		if(pPush!=null&&pPop!=null){
			Stack<Integer> stack=new Stack<>();
			int i=0,j=0;
			while(j<pPop.length){
				while(i<pPush.length && pPop[j]!=pPush[i]){
					stack.push(pPush[i]);
					i++;
				}
				i++;
				j++;
				int top=0;
				while(!stack.isEmpty() && (top=stack.pop())==pPop[j]){
					j++;
				}
				if(j<pPop.length){
					stack.push(top);
				}
				if(i>=pPush.length && !stack.empty()){
					break;
				}
			}
			if(stack.isEmpty()){
				res=true;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] pPush = { 1, 2, 3, 4, 5 };
		int[] pPop = { 4, 3, 5, 1, 2 };//{ 4, 3, 5, 2, 1 }; 
		boolean flag = new E22StackPushPopOrder().check(pPush, pPop);
		System.out.println(flag);
	}
}
