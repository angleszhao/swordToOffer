package swordToOffer;

public class E20PrintMatrix {

	public E20PrintMatrix() {
		// TODO Auto-generated constructor stub
	}
	public void printCircle(int[][] array){
		if(array==null)
			return;
		int start=0;
		while(array[0].length>start*2 && array.length>start*2){
			printOneCircle(array,start);
			start++;
		}
	}
	private void printOneCircle(int[][] array, int start) {
		int rows=array.length;
		int columns=array[0].length;
		int endY=columns-start-1;
		int endX=rows-start-1;
		//left -> right
		for(int i=start;i<=endY;i++){
			System.out.print(array[start][i]+",");
		}
		System.out.println();
		if(start<endY){
		//up -> down
		for(int i=start+1;i<=endX;i++){
			System.out.print(array[i][endY]+",");
		}
		System.out.println();
		}
		//right -> left
		if(start<endY && start<endX){
		for(int i=endY-1;i>=start;i--){
			System.out.print(array[endX][i]+",");
		}
		System.out.println();
		}
		//down -> up
		if(start<endX && (endX-start)>=2){
		for(int i=endX-1;i>=start+1;i--){
			System.out.print(array[i][start]+",");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		E20PrintMatrix test=new E20PrintMatrix();
		test.printCircle(array);
	}
}
