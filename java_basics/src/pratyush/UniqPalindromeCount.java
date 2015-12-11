package pratyush;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqPalindromeCount {
	static int Count(String str){
		int num = 0;
		Set<String> pal=new HashSet<String>();
		for(int i=1;i<str.length();i++){
			for(int j=0;j<str.length()-i+1;j++){
				int k=j+i-1;
				int l=j;
				boolean flag=true;
				while(k>l){
					if(str.charAt(l)==str.charAt(k)){
						l++;
						k--;
					}
					else{
						flag=false;
						break;
					}
				}
				if(flag==true){
					System.out.println(str.substring(j,j+i));
					pal.add(str.substring(j,j+i));
				}
			}
		}
		System.out.println(pal.size());
		return pal.size();
	}
	public static void main(String args[]){
		System.out.println(Count("ababcdc"));
	}

}
