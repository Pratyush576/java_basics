package StringAlgo;
import StringAlgo.DP_palindrome;
/*
 * Time complexity: O ( n^3 )
 * Auxiliary complexity: O ( 1 )
 */
public class BruteForce_Palindrome {
	static String BruteForce(String str){
		if(str.length()==0){
			return str.toString();
		}
		String temp="";
		
		for(int i=1;i<str.length();i++){
			//System.out.println("Char: "+str[i]);
			for(int j=0;j<str.length()-i;j++){
				int k=j;
				int l=j+i-1;
				//System.out.println(k+" "+l+" "+i);
				//System.out.println(str.substring(k,l));
				while(k<l){
					//System.out.println(str.substring(k,l));
					if(str.charAt(k)==str.charAt(l)){
						//System.out.println(str.charAt(k)+" "+str.charAt(l));
						k++;
						l--;
					}
					else break;
					
				}	
				//System.out.println("k="+k+" j="+j);
				if(k>=l){
					System.out.println("k="+k+" j="+j+" i="+i);
					temp=str.substring(j,j+i);
					System.out.println("temp: "+temp);
				}
			}
		}
		return temp;
	}
	
	
	
	
	public static void main(String[] args){
		String str="forgeeksskeegfor";
		char[] str_c=str.toCharArray();
		/*
		 * BruteForce 
		 */
		System.out.println("Largest Palindrome: "+BruteForce(str));
		/*
		 * Dynamic Prog.
		 */
		System.out.println("Largest Palindrome:"+DP_palindrome.DPPalindrome(str));
		/*
		 * Manacher's Algo
		 */
		System.out.println("Largest Palindrome: "+ManachersAlgorithm.findLongestPalindrome(str));
	}
}
