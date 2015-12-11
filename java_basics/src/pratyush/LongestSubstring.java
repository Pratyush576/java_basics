package pratyush;
/*Given two strings STR1 and STR2 .we need to find longest substring in STR1 whose all characters 
 * are taken from string STR2(was asked to write code for it in optimal time)
    STR1-abcdefacbccbagfacbacer
	STR2-abc
	ans : length : 7
		  acbccba  (from position 7 to 13) 
 */

public class LongestSubstring {
	public static String IsLongestSubstring(String str1,String str2){
		String temp="",flag="";
		for(int i=0;i<str1.length();i++){
			boolean match=false;
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					flag+=str1.charAt(i);
					match=true;
					break;
				}
				
			}
			if(match==false){
				System.out.println("!"+str1.charAt(i)+" "+temp);
				if(temp.length()<flag.length()){
					temp=flag;
					System.out.println(temp+" "+temp);
					flag="";
				}else{
					flag="";
				}
			}
			else
				System.out.println(str1.charAt(i)+" "+temp);
		}
		return temp;
	}
	public static void main(String[] args){
		String STR1="abcdefacbccbagfacbaaaacer";
		String STR2="abc";
		System.out.println(STR1+" "+STR2);
		System.out.println(IsLongestSubstring(STR1, STR2));
	}
}
