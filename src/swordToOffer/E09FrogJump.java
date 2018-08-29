package swordToOffer;

public class E09FrogJump {

	public E09FrogJump() {
		// TODO Auto-generated constructor stub
	}
	public int JumpFloor(int target){
		int first=1;
		int second=2;
		int result=0;
		if(target==1 || target==2){
			return target;
		}
		else{
			for(int i=3;i<=target;i++){
				result=first+second;
				first=second;
				second=result;
			}
			return result;
		}
	}
	/**
	 * F(n)=F(n-1)+F(n-2)+....+F(0)

		F(n-1)=F(n-2)+F(n-3)+F(0)

 		两式相减得  F(n)=2*F(n-1)
	 * @param target
	 * @return
	 */
	public int JumpFloor2(int target){
		int result=0;
		int first=1;
		if(target==0||target==1){
			return 1;
		}else{
			for (int i=2;i<=target;i++){
				result=2*first;
				first=result;
			}
			return result;
		}
	}

}
