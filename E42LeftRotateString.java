package swordToOffer;

public class E42LeftRotateString {

	public String reverse(String str) {
		char[] arr=str.toCharArray();
		for(int i=0;i<(arr.length+1)/2;i++){
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		return String.valueOf(arr);
	}
	public void reverseSentence(String sentence){
		if(sentence==null)
			return;
		sentence=reverse(sentence);
		String[] splitstr=sentence.split(" ");
		String res="";
		for(String s:splitstr){
			res+=reverse(s)+" ";
		}
		System.out.println(res);
	}

	public void leftRotateStr(String sentence,int num){
		if(sentence==null||num<0 || num>sentence.length())
			return;
		String res="";
		String[] splitstr={sentence.substring(0,num),sentence.substring(num,sentence.length())};
		for(String s:splitstr){
			res+=reverse(s);
		}
		res=reverse(res);
		System.out.println(res);
	}
	public static void main(String[] args) {
		E42LeftRotateString test=new E42LeftRotateString();
		String sentence="I am a student.";
		test.reverseSentence(sentence);
		String sentence2="abcdefg";
		test.leftRotateStr(sentence2, 2);
	}
}
