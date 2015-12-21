package pratyush;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class String_permutation {
	static HashMap<String, String> hm=new HashMap<String, String>();
	static int cnt=0;
	public static void StrPer(char[] str,int l,int r){
		if(l==r){
			System.out.println(str);
			hm.put(new String(str), new String(str));
			cnt++;
			return;
		}
		char ch1;
		for(int i=l;i<=r;i++){
			
			ch1=str[l];
			str[l]=str[i];
			str[i]=ch1;
			
			StrPer(str, l+1, r);
			
			ch1=str[l];
			str[l]=str[i];
			str[i]=ch1;	
		}
	}
	public static void  main(String[] args){
		String str="ABADE";
		char ch[]=str.toCharArray();
		StrPer(ch,0,str.length()-1);
		System.out.println(hm.size());
		//System.out.println(cnt);
	}
}
