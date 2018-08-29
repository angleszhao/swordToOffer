package swordToOffer;
//https://www.cnblogs.com/fankongkong/p/7007869.html
public class E56CircleInLink {

	public ListNode EntryNodeOfLoop2(ListNode pHead){
		ListNode fast=pHead;
		ListNode slow=pHead;
		while(fast!=null&&fast.nextNode!=null){
			fast=fast.nextNode.nextNode;
			slow=slow.nextNode;
			if(fast==slow){
				fast=pHead;
				while(fast!=slow){
					fast=fast.nextNode;
					slow=slow.nextNode;
				}
				return fast;
			}
		}
		return null;
	}

}
