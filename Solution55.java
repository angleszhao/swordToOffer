package swordToOffer;
//https://www.cnblogs.com/andy-zhou/category/962966.html
//https://blog.csdn.net/baiye_xing/article/details/78428396
public class Solution55 {

	//Insert one char from stringstream
    int index=0;  //所有出现一次字符顺序
    int[] ascll=new int[256]; //存一共256个ascll码字符
    public Solution55(){
        for(int i=0;i<256;i++){
            ascll[i]=-1;
        }
    }
    public void Insert(char ch) {
        if(ascll[ch]==-1){
            ascll[ch]=index;
            index++;
        }else if(ascll[ch]>-1){
            ascll[ch]=-2;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int resultNum=Integer.MAX_VALUE;
        int resultIndex=-3;
        for(int i=0;i<256;i++){
            if(ascll[i]==-2||ascll[i]==-1){
                continue;
            }
            if(resultNum>ascll[i]){
                resultNum=ascll[i];
                resultIndex=i;
            }
        }
        if(resultIndex==-3){
            return '#';
        }
        return (char)resultIndex;
    }
    public static void main(String[] args) {
    	Solution55 solution55 = new Solution55();
        solution55.Insert('g');
        solution55.Insert('o');
        solution55.Insert('o');
        solution55.Insert('g');
        solution55.Insert('l');
        solution55.Insert('e');
        System.out.println(solution55.FirstAppearingOnce());
	}

}
