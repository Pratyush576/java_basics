package StringAlgo;

public class ManachersAlgo1 {

	public static void Palindrome(String st){
		if(st.length()==0||st.length()==1){
			System.out.println(st);
			return;
		}
		System.out.println(st.replace("", "#"));
		//String ch=("$"+st.replace("", "#")+"@").toCharArray();
		char[] str1=("$"+st.replace("", "#")+"@").toCharArray();
		//System.out.println(ch);
		int[] p=new int[str1.length];
		for(int i=0;i<str1.length;i++){
			p[i]=0;
		}
		
		int center=0,right=0,mirror;
		int palmax=1;
		for(int i=1;i<str1.length-1;i++){
			mirror=2*center-i;
			if(right>i){
				if((right-i)>p[mirror]){
					p[i]=p[mirror];
				}else{
					p[i]=right-i;
				}
			}
			else{
				p[i]=0;
			}
			
			while(str1[i+p[i]+1]==str1[i-p[i]-1]){
				p[i]++;
			}
			
			if(p[i]>p[palmax])
				palmax=i;
			if(i+p[i]>right){
				center=i;
				right=i+p[i];
			}
		}
		
		
		System.out.println(palmax+" "+p[palmax]);
		String  palstr="";
		for(int i=palmax-p[palmax];i<palmax+p[palmax];i++){
			palstr+=str1[i];
			//System.out.print(str1[i]);
		}
		System.out.println(palstr.replace("#", ""));
		
	}
	
	
	public static void main(String args[]){
		String str="geeaeegksforgeoeg";	
		Palindrome(str);
	}
}
