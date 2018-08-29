package swordToOffer;
//https://blog.csdn.net/u011080472/article/details/51283717
public class E53RegexMatch {

	public boolean match(char[] str,char[] pattern){
		if(str==null || pattern==null)
			return false;
		if(str.length==1){
			if(str[0]==pattern[0]||pattern[0]=='.')
				return true;
			return false;
		}
		int sindex=0;
		int pindex=0;
		return matchIndex(str,sindex,pattern,pindex);
	}

	public boolean matchIndex(char[] str, int sindex, char[] pattern, int pindex) {
		if(sindex==str.length&&pindex==pattern.length)
			return true;
		if(sindex!=str.length&&pindex==pattern.length)
			return false;
		if(pindex+1<pattern.length&&pattern[pindex+1]=='*'){
			if(sindex!=str.length && pattern[pindex]==str[sindex] ||
					sindex!=str.length&&pattern[pindex]=='.'){
				return matchIndex(str, sindex+1, pattern, pindex+2) ||
						matchIndex(str, sindex, pattern, pindex+2) ||
						matchIndex(str, sindex+1, pattern, pindex);
			}else{
				return matchIndex(str, sindex, pattern, pindex+2);
			}
		}
		if(sindex!=str.length && pattern[pindex]==str[sindex] ||
				sindex!=str.length&&pattern[pindex]=='.'){
			return matchIndex(str, sindex+1, pattern, pindex+1);
		}
		return false;
	}

	public static void main(String[] args) {
		E53RegexMatch test=new E53RegexMatch();
		char[] str={'a','a','a'};
		char[] pattern={'a','b','*','a'};//{'a','b','*','a','c','*','a'};//{'a','.','a'};
		System.out.println(test.match(str, pattern));
	}
}
