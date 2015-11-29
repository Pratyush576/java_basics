package pratyush;

public class LargestPalindromString {
	public static boolean palindrome(String temp){
		//System.out.println(temp);
		if(temp.length()==2){
			if(temp.charAt(0)==temp.charAt(1))
				return true;
			else
				return false;
		}
		//System.out.println(temp.length()/2);
		for(int i=0;i<temp.length()/2;i++){
			if(temp.charAt(i)!=temp.charAt(temp.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		String str="jkhashhdgdhhsahkhsd";
		//String []chars=str.split("");
		char chars[]=str.toCharArray();
		System.out.println(chars[1]);
		String largest="j";
		int longest=1;
		for(int i=2;i<str.length();i++){
			for(int j=0;j<str.length()-i;j++){
				if(palindrome(str.substring(j, j+i))){
					longest=i;
					largest=str.substring(j, j+i);
					//System.out.println("Palindrome"+str.substring(j, j+i));
				}
			}
		}
		System.out.println("Largest Palindrome: "+largest +"\tLenght: "+longest);
	}

}
