package swordToOffer;
//https://blog.csdn.net/jsqfengbao/article/category/5678957/1
//https://www.cnblogs.com/andy-zhou/category/962966.html
//https://blog.csdn.net/snow_7/article/category/6269805/1
//https://blog.csdn.net/baiye_xing/article/details/78428561
public class E03FindNumber {

	public E03FindNumber() {
		// TODO Auto-generated constructor stub
	}

	public boolean Find(int[][] array,int target){
		boolean res=false;
		int i=0;
		int j=array[0].length-1;
		while(i<array.length && j>=0){
		if(target>array[i][j]){
			i+=1;
		}else if(target <array[i][j]){
			j-=1;
		}else{
			res=true;
			System.out.println("i="+i+"; j="+j);
			break;
		}
		}
		return res;
	}
	public static void main(String[] args) {
		E03FindNumber test=new E03FindNumber();
		int[][] array={{1,2,3,4},{5,6,7,8},{10,11,12,13},{20,21,22,23}};
		test.Find(array, 9);
	}
}
