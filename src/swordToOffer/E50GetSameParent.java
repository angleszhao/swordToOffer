package swordToOffer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class E50GetSameParent {

	private class TreeNode{
		int val;
		List<TreeNode> children=new LinkedList<>();
		public TreeNode(){
			
		}
		public TreeNode(int val){
			this.val=val;
		}
		public String toString(){
			return val+"";
		}
	}
	
	public void getNodePath(TreeNode root,TreeNode target,List<TreeNode> path, List<TreeNode> tmppath) {
		if(root == null || root==target)
			return;
		tmppath.add(root);
		List<TreeNode> children=root.children;
		for(TreeNode node:children){
			if(node==target){
//				path.add(node);
				tmppath.add(node);
				path.addAll(tmppath);
//				return;
				break;
			}else{
				getNodePath(node, target, path,tmppath);
			}
			tmppath.remove(tmppath.size()-1);
		}
//		path.remove(path.size()-1);
	}

	public TreeNode getLastCommonNode(List<TreeNode> p1,List<TreeNode> p2){
		Iterator<TreeNode> it1=p1.iterator();
		Iterator<TreeNode> it2=p2.iterator();
		TreeNode res=null;
		while(it1.hasNext()&&it2.hasNext()){
			TreeNode tmp=it1.next();
			if(tmp==it2.next()){
				res=tmp;
			}
		}
		return res;
	}
	
	public TreeNode getLastCommonParent(TreeNode root,TreeNode p1,TreeNode p2){
		if(root == null || p1==null || p2==null)
			return null;
		List<TreeNode> path1=new LinkedList<>();
		List<TreeNode> path2=new LinkedList<>();
		List<TreeNode> tmppath1=new LinkedList<>();
		List<TreeNode> tmppath2=new LinkedList<>();
		getNodePath(root, p1, path1,tmppath1);
		getNodePath(root, p2, path2,tmppath2);
		Iterator<TreeNode> it1=path1.iterator();
		/*while(it1.hasNext())
			System.out.print(it1.next()+"->");
		System.out.println();
		
		Iterator<TreeNode> it2=path2.iterator();
		while(it2.hasNext())
			System.out.print(it2.next()+"->");*/
		return getLastCommonNode(path1, path2);
	}
	
	public static void main(String[] args) {
		E50GetSameParent test=new E50GetSameParent();
		test.test01();
		System.out.println("============");
		test.test02();
		System.out.println("=========");
		test.test03();
	}
	public void test01(){
		// 形状普通的树
	    //             1
	    //           /   \
	    //          2      3
	    //        /  \
	    //       4      5
	    //      / \  /  |  \
	    //    6   7 8   9  10
		TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);

        n1.children.add(n2);
        n1.children.add(n3);

        n2.children.add(n4);
        n2.children.add(n5);

        n4.children.add(n6);
        n4.children.add(n7);

//        n3.children.add(n5);

        n5.children.add(n8);
        n5.children.add(n9);
        n5.children.add(n10);
        System.out.println(getLastCommonParent(n1, n4, n5));
	}
	public void test02(){
		// 树退化成一个链表
	    //               1
	    //              /
	    //             2
	    //            /
	    //           3
	    //          /
	    //         4
	    //        /
	    //       5
		TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.children.add(n2);
        n2.children.add(n3);
        n3.children.add(n4);
        n4.children.add(n5);

        System.out.println(getLastCommonParent(n1, n3, n5));
	}
	public void test03(){
		 // 树退化成一个链表，一个结点不在树中
	    //               1
	    //              /
	    //             2
	    //            /
	    //           3
	    //          /
	    //         4
	    //        /
	    //       5
		TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.children.add(n2);
        n2.children.add(n3);
        n3.children.add(n4);
        n4.children.add(n5);

        System.out.println(getLastCommonParent(n1, n5, n6));
	}
}
