package swordToOffer;

public class MyStack<K> {

	public ListNode<K> head;
	public int length;
	
	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	public void push(K item){
		ListNode<K> node=new ListNode<>();
		node.data=item;
		node.nextNode=head;
		head=node;
		length++;
	}
	public K pop(){
		if(head==null)
			return null;
		ListNode<K> temp=head;
		head=head.nextNode;
		length--;
		return temp.data;
	}

}
