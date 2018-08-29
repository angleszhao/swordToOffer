package swordToOffer;


public class E17MergeSortedLists {
	private class Node{
        private int data;
        private Node next;
        
        public Node(int data){
            this.data = data;
        }
	}

	public E17MergeSortedLists() {
		// TODO Auto-generated constructor stub
	}
	public Node Merge(Node pHead1,Node pHead2){
		if(pHead1==null)
			return pHead2;
		if(pHead2==null)
			return pHead1;
		Node pMergeHead=null;
		if(pHead1.data < pHead2.data){
			pMergeHead=pHead1;
			pMergeHead.next=Merge(pHead1.next,pHead2);
		}else{
			pMergeHead=pHead2;
			pHead2.next=Merge(pHead1, pHead2.next);
		}
		return pMergeHead;
	}

	public static void main(String[] args) {
		E17MergeSortedLists test=new E17MergeSortedLists();
		Node head1=test.new Node(1);
		Node second1=test.new Node(2);
		Node third1=test.new Node(3);
		Node forth1=test.new Node(4);
		head1.next=second1;
		second1.next=third1;
		third1.next=forth1;
		Node head2=test.new Node(2);
		Node second2=test.new Node(5);
		Node third2=test.new Node(7);
		Node forth2=test.new Node(8);
		head2.next=second2;
		second2.next=third2;
		third2.next=forth2;
		Node res=test.Merge(head1,head2);
		while(res!=null){
		System.out.println(res.data);
		res=res.next;
		}
	}
}
