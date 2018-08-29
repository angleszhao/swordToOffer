package swordToOffer;

public class E24AfterOrderBST {

	public boolean verify(int[] array,int start,int end) throws Exception {
		boolean res=false;
		if(array==null||array.length<2)
			return true;
		if(start<0)
			throw new Exception("first can't be less than 0");
		if(end>array.length)
			throw new Exception("last can't be greater than count of the element.");
		int root=array[end];
		int i=start;
		for(;i<end;i++){
			if(array[i]>root)
				break;
		}
		int j=i;
		for(;j<end;j++){
			if(array[j]<root)
				return false;
		}
		boolean left=true;
		if(i>start)
			left=verify(array, start, i-1);
		boolean right=true;
		if(i<end)
			right=verify(array, i, end-1);
		res=left && right;
		return res;
	}

	public static void main(String[] args) throws Exception {
		int[] arr={7,4,6,5};//{5,7,6,9,11,10,8};
		E24AfterOrderBST test = new E24AfterOrderBST();
		System.out.println(test.verify(arr, 0, arr.length-1));
	}
}
