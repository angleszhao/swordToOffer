package swordToOffer;

public class E37FirstCommonNodesInLists {

	public int getLength(ListNode<Integer> root){
		int res=0;
		if(root==null)
			return 0;
		ListNode<Integer> point=root;
		while(point!=null){
			res++;
			point=point.nextNode;
		}
		return res;
	}
	public ListNode<Integer> findFirstCommonNode(ListNode<Integer> root1,ListNode<Integer> root2){
		ListNode<Integer> pointLong=null;
		ListNode<Integer> pointShort=null;
		int length1=getLength(root1);
		int length2=getLength(root2);
		int dif=0;
		if(length1>length2){
			pointLong=root1;
			pointShort=root2;
			dif=length1-length2;
		}else{
			pointLong=root2;
			pointShort=root1;
			dif=length2-length1;
		}
		for(int i=0;i<dif;i++){
			pointLong=pointLong.nextNode;
		}
		while(pointLong!=null && pointShort!=null && pointLong!=pointShort){
			pointLong=pointLong.nextNode;
			pointShort=pointShort.nextNode;
		}
		
		return pointLong;
	}
	public static void main(String[] args) {
		
	}
}
