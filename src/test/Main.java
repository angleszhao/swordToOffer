package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       /* Scanner sc = new Scanner(System.in);
	        int n = Integer.parseInt(sc.nextLine());
	        int[][] k=new int[n][n];
	        int m = 1;
	        for(int i = 0; i < n; i++){
	            String line=sc.nextLine();
	            String[] ks=line.split(" ");
	            for(int j=0;j<ks.length;j++){
	                k[i][j]=Integer.parseInt(ks[j]);
	            }
	        } 
	        int[] flag=new int[n];
	        flag[0]=m;
	        for(int i = 0; i < n; i++){
	            int len=k[i].length;
	            int tmp=flag[i];
	            for(int j=0;j<len;j++){
	                if(k[i][j]==0)
	                    break;
	                else{
	                	
	                    int num=k[i][j];
	                    if(flag[i]!=0){
	                 //       flag[num-1]=flag[i-1];
	                    	if(tmp>flag[i])
	                    		tmp=flag[i];
	                        
	                    } else if(flag[num-1]!=0){
	                    	if(flag[num-1]<tmp)
	                    		tmp=flag[num-1];
	                //    	flag[i-1]=flag[num-1];
	                    }else{
	                        
	                        if(tmp==0 || tmp>(m+1)){
	                        	
	                        	tmp=m+1;
	                        }
	                 //       flag[i-1]=m;
	                 //       flag[num-1]=flag[i-1];
	                    }
	                }
	            }
	            flag[i]=tmp;
	            for(int j=0;j<len;j++){
	            	if(k[i][j]==0)
	                    break;
	                else{
	                	
	                	int num=k[i][j];
	                	flag[num]=tmp;
	                }
	            }
	            if(tmp>m){
	            	m=tmp;
	            }
	        }
	        for(int i=0;i<n;i++){
	            System.out.println(flag[i]);
	        }
	        System.out.println("======m: "+m+"=======");
	        */
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(sc.nextLine());
            String[] strs=new String[n];
            for(int j=0;j<n;j++){
                strs[j]=sc.nextLine();
                //System.out.println("==="+strs[j]+"===");
            }
            boolean f=false;
            for(int k1=0;k1<strs.length-1;k1++){
                for(int k2=k1+1;k2<strs.length;k2++){
                    String str1=strs[k1];
                    String str2=strs[k2];
                    if(isOk(str1,str2)){
                        f=true;
                        break;
                    }//else{
                     //   System.out.println("Sad");
                    //}
                    //System.out.println("Sad");
                }
                if(f)
                    break;
            }
            if(f)
                System.out.println("Yeah");
            else{
                System.out.println("Sad");
            }
        }
	    }

	public static boolean isOk(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int len=str1.length();
        char[] tmp1=new char[len];
        char[] tmp2=new char[len];
        tmp1[0]=str2.charAt(0);
        tmp2[0]=str2.charAt(0);
        int start=0;
        int i=0;
        for(;i<len;i++){
            if(str1.charAt(i)==str2.charAt(0)){
                start=i;
                break;
            }
        }
        if(i==len)
            return false;
        int start1=start;
        for(int j=0;j<len;j++){
            tmp1[j]=str1.charAt(start1);
            start1=(start1+1)%len;
        }
        System.out.println("tmp1: "+String.valueOf(tmp1));
        int start2=start;
        for(int j=0;j<len;j++){
            tmp2[j]=str1.charAt(start2);
            start2=(start2-1)%len;
            if(start2<0)
            	start2=len+start2;
        }
        
        System.out.println("tmp2: "+new String(tmp2));
        if((new String(tmp1)).equals(str2)||new String(tmp2).equals(str2))
        	return true;
        else
        	return false;
    }
}
