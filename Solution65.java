package swordToOffer;
//https://blog.csdn.net/u011080472/article/details/51291089
import java.util.ArrayList;
import java.util.Arrays;

public class Solution65 {

	 public ArrayList<Integer> maxInWindows(int [] num, int size){
	        ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        if(num==null||num.length==0||size==0||size>num.length){
	            return arrayList;
	        }
	        int[] tmp=new int[size];
	        /*for(int i=0;i<size;i++){
	            tmp[i]=num[i];
	        }
	        Arrays.sort(tmp);
	        arrayList.add(tmp[size-1]);
	        for(int j=size;j<num.length;j++){
	            for(int k=0;k<size;k++){
	                if(tmp[k]==(num[j-size])){
	                    tmp[k]=num[j];
	                    break;
	                }
	            }
	            Arrays.sort(tmp);
	            arrayList.add(tmp[size-1]);
	        }*/
	        for(int j=0;j<=num.length-size;j++){
	            for(int k=0;k<size;k++){
	                tmp[k]=num[j+k];
	            }
	            Arrays.sort(tmp);
	            arrayList.add(tmp[size-1]);
	        }
	        return arrayList;
	    }

	 public static void main(String[] args) {
		 Solution65 test=new Solution65();
		 int[] num={2,3,4,2,6,2,5,1};
		 ArrayList<Integer> arrayList=test.maxInWindows(num, 3);
		 for(Integer a:arrayList){
			 System.out.println(a);
		 }
	}
}
