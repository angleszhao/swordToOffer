package swordToOffer;

public class E11PowerWithExp {
//https://blog.csdn.net/jsqfengbao/article/details/47164537
	public E11PowerWithExp() {
		// TODO Auto-generated constructor stub
	}
	public double powerWithExponent(double base,int exponent){
		if(exponent==0)
			return 1;
		if(exponent==1)
			return base;
		double result=0;
		result=powerWithExponent(base, exponent>>1);
		result*=result;
		if((exponent&0x1)==1)
			result*=base;
		return result;
	}
	public static void main(String[] args) {
		E11PowerWithExp test=new E11PowerWithExp();
		System.out.println(test.powerWithExponent(3, 5));
	}

}
