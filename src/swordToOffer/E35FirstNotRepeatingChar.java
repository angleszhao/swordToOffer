package swordToOffer;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class E35FirstNotRepeatingChar {

	public Character firstNotRepeating(String str) {
		if(str==null)
			return null;
		HashMap<Character, Integer> hash=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			if(hash.containsKey(temp))
				hash.put(temp, hash.get(temp)+1);
			else
				hash.put(temp, 1);
		}
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			int count=hash.get(temp);
			if(count==1)
				return temp;
		}
		return null;
	}

	public static void main(String[] args) {
		String str = "abaccdebff";
		E35FirstNotRepeatingChar test = new E35FirstNotRepeatingChar();
		System.out.println(test.firstNotRepeating(str));
	}
}
