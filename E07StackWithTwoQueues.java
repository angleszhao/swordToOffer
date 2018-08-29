package swordToOffer;

import java.util.LinkedList;
import java.util.Queue;

public class E07StackWithTwoQueues {

	Queue<String> queue1=new LinkedList<>();
	Queue<String> queue2=new LinkedList<>();
	public E07StackWithTwoQueues() {
		// TODO Auto-generated constructor stub
	}
	public String pop(){
		String re=null;
		if(queue1.size()==0 && queue2.size()==0)
			return null;
		if(queue2.size()==0){
			while(queue1.size()>0){
				re=queue1.remove();
				if(queue1.size()!=0)
					queue2.add(re);
			}
		}else if(queue1.size()==0){
			while(queue2.size()>0){
				re=queue2.remove();
				if(queue2.size()!=0)
					queue1.add(re);
			}
		}
		return re;
	}
	public String push(String str){
		if(queue1.size()==0&&queue2.size()==0){
			queue1.add(str);
		}else if(queue1.size()!=0){
			queue1.add(str);
		}else if(queue2.size()!=0){
			queue2.add(str);
		}
		return str;
	}

}
