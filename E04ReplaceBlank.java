package swordToOffer;

public class E04ReplaceBlank {

	public E04ReplaceBlank() {
		// TODO Auto-generated constructor stub
	}

	//计算字符串中包含的空格个数
	public int getBlankNum(String teststr){
		int res=0;
		for(int i=0;i<teststr.length();i++){
			String temp=String.valueOf(teststr.charAt(i));
			if(temp.equals(" "))
				res++;
		}
		return res;
	}
	
	public String replaceAllBlank(String teststr){
		if(teststr==null || teststr.length()<=0)
			return "";
		int length=teststr.length();
		int newlength=length+getBlankNum(teststr)*2;
		char[] tempArray=new char[newlength];
		int indexofOriginal=length-1;
		int indexofNew=newlength-1;
		while(indexofOriginal>=0 && indexofNew>=0){
			if(teststr.charAt(indexofOriginal)==' '){
				tempArray[indexofNew--]='0';
				tempArray[indexofNew--]='2';
				tempArray[indexofNew--]='%';
			}else{
				tempArray[indexofNew--]=teststr.charAt(indexofOriginal);
			}
			indexofOriginal--;
		}
		return String.copyValueOf(tempArray);
	}
	public static void main(String[] args) {
		E04ReplaceBlank test=new E04ReplaceBlank();
		String str="We are happy haha";
		System.out.println(test.replaceAllBlank(str));
	}
}
