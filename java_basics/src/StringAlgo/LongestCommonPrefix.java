package StringAlgo;

public class LongestCommonPrefix {
	public static String longestCommonPrefixStr(String[] strs) {
		//System.out.println(strs.length);
	    if(strs == null || strs.length == 0)
	        return "";
	 
	    int minLen=Integer.MAX_VALUE;
	    for(String str: strs){
	        if(minLen > str.length())
	            minLen = str.length();
	    }
	    if(minLen == 0) return "";
	 
	    for(int j=0; j<minLen; j++){
	        char prev='0';
	        for(int i=0; i<strs.length ;i++){
	            if(i==0) {
	                prev = strs[i].charAt(j);
	                continue;
	            }
	 
	            if(strs[i].charAt(j) != prev){
	                return strs[i].substring(0, j);
	            }
	        }
	    }
	 
	    return strs[0].substring(0,minLen);
	}
	
	public static void main(String args[]){
		String[] str={"abcwijsw","abcdkhd","abcg"};
		System.out.println(longestCommonPrefixStr(str));
	}
}
