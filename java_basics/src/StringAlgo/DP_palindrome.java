package StringAlgo;

/*
 * The time complexity can be reduced by storing results of subproblems.
 * We maintain a boolean table[n][n] that is filled in bottom up manner.
 * The value of table[i][j] is true, if the substring is palindrome, otherwise false.
 * Time complexity: O ( n^2 )
 * Auxiliary Space: O ( n^2 )
 */
public class DP_palindrome {
	//static boolean table[][];
	public static String DPPalindrome(String str){
		if(str==null)
			return "";
		int Max_s=0,Max_e=0;
		boolean table[][]=new boolean[str.length()][str.length()];
		for(int i=0;i<str.length();i++){
			table[i][i]=true;
		}
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1))
				table[i][i+1]=true;
		}


		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				int k=j;
				int l=i;

				//System.out.println("===================="+i+","+j+"==================");
				while(k>=l){
					//System.out.println(l+" "+k+" "+str.charAt(l)+" "+str.charAt(k));

					if(table[l][k]==true){
						table[i][j]=true;
						if((j+1-i)>(Max_e-Max_s+1)){
							Max_s=i;
							Max_e=j;
							//System.out.println(Max_s+" "+Max_e);
						}
						//System.out.println("Palindrome String: "+str.substring(i,j+1)+" i="+i+" j="+j+" "+(j+1-i));
						break;
					}

					if(str.charAt(l)==str.charAt(k)){
						//System.out.println("l="+l+" k="+k);
						l++;
						k--;
						if(l>=k){
							if((j+1-i)>(Max_e-Max_s+1)){
								Max_s=i;
								Max_e=j;
							}
						}
					}
					else{
						table[i][j]=false;
						table[k][l]=false;
						break;
					}

				}


			}
		}

		System.out.println(Max_s+" "+Max_e);
		return str.substring(Max_s, Max_e);
	}
}
