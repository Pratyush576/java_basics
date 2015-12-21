package StringAlgo;

public class LCS {
	static int num=0;
	static String  Print_LCS(char[] ch1,char[] ch2,int l,int r,String LCS_str){
		num++;
		String str="";
		if(l>=ch1.length||r>=ch2.length){
			return LCS_str; 
		}
		if(ch1[l]==ch2[r]){
			LCS_str+=ch1[l];
			l++;
			r++;
			str=Print_LCS(ch1, ch2, l, r, LCS_str);
		}
		else{
			String st1=Print_LCS(ch1, ch2, l+1, r, LCS_str);
			String st2=Print_LCS(ch1, ch2, l, r+1, LCS_str);
			if(st1.length()>st2.length()){
				str=st1;
			}else{
				str=st2;
			}
		}
		return str;
	}
	
	public static void main(String args[]){
		String str1="ABCDGHP";
		String str2="AEDFHRGHP";
		System.out.println(Print_LCS(str1.toCharArray(),str2.toCharArray(),0,0,""));
		System.out.println(num);
	}
}