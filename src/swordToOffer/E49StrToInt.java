package swordToOffer;

public class E49StrToInt {

	public int StrToIInt(String str) {
		if(str==null||str.length()==0)
			return 0;
		int len=str.length();
		int index=0;
		boolean minus=false;
		if(str.charAt(0)=='+')
			index++;
		else if(str.charAt(0)=='-'){
			minus=true;
			index++;
		}
		if(index!=0&&len==1)
			return 0;
		int num=StrToInt(str,index,minus);
		if(num!=0)
			num=minus?num*(-1):num;
		return num;
	}

	private int StrToInt(String str, int index, boolean minus) {
		int res=0;
		int len=str.length();
		for(int i=index;i<len;i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				res=res*10;
				res+=str.charAt(i)-'0';
				if((minus &&(res*(-1)>0)) || (!minus && (res<0))){
					res=0;
					break;
				}
			}else{
				res=0;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s="-1235";
		E49StrToInt test=new E49StrToInt();
		System.out.println(test.StrToIInt(s));
	}
}
