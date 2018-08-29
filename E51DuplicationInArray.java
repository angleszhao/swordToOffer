package swordToOffer;
//https://blog.csdn.net/jsqfengbao/article/details/47438557
public class E51DuplicationInArray {

	public E51DuplicationInArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] arr = {2,3,1,0,2,5,3};
		E51DuplicationInArray test = new E51DuplicationInArray();
		System.out.println(test.duplicate(arr));
	}

	public boolean duplicate(int[] arr) {
		if(arr==null||arr.length<=0)
			return false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0||arr[i]>arr.length-1)
				return false;
		}
		for(int i=0;i<arr.length;i++){
			while(arr[i]!=i){
				if(arr[i]==arr[arr[i]]){
					System.out.println(arr[i]);
					return true;
				}else{
					int temp=arr[i];
					arr[i]=arr[temp];
					arr[temp]=temp;
				}
			}
			
		}
		return false;
	}
}
