package pratyush;

import java.util.Arrays;

public class String_permutation {
	static int cnt=0;
	public static void StrPer(char[] str,int l,int r){
		if(l==r){
			System.out.println(str);
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
		String str="ABCD";
		char ch[]=str.toCharArray();
		StrPer(ch,0,str.length()-1);
		System.out.println(cnt);
	}
}
