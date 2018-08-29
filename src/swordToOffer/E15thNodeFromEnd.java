package swordToOffer;

public class E15thNodeFromEnd {
	private class Node{
        private Object data;
        private Node next;
        
        public Node(Object data){
            this.data = data;
        }
	}

	public E15thNodeFromEnd() {
		// TODO Auto-generated constructor stub
	}
	public Node FindKthToTail(Node head,int k){
		if(head==null || k<=0){
			return null;
		}
		Node ANode=head;
		Node BNode=null;
		for(int i=0;i<k-1;i++){
			if(ANode.next!=null)
				ANode=ANode.next;
			else
				return null;
		}
		BNode=head;
		while(ANode.next!=null){
			ANode=ANode.next;
			BNode=BNode.next;
		}
		return BNode;
	}
	
	public static void main(String[] args) {
		E15thNodeFromEnd test=new E15thNodeFromEnd();
		Node head=test.new Node(1);
		Node second=test.new Node(2);
		Node third=test.new Node(3);
		Node forth=test.new Node(4);
		head.next=second;
		second.next=third;
		third.next=forth;
		
		Node res=test.FindKthToTail(head, -1);
		System.out.println(res.data);
	}

}
