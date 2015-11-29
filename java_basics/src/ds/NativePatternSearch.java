package ds;

public class NativePatternSearch {
	public static void Match_Pattern(String str,String patt){
		int i = 0;
		//System.out.println(str);
		//System.out.println(str.length()-patt.length());
		while(i<=str.length()-patt.length()){
			//System.out.println(str.substring(i,i+patt.length())+i);
			if(str.substring(i,i+patt.length()).equals(patt)){
				System.out.println("String found at "+i);
			}
			//System.out.println(i);
			i++;
		}
		System.out.println("=============");
	}
	public static void main(String[] args){
		String str="jaskjhiaknaskjas";
		String patt="jas";
		Match_Pattern(str, patt);
	}
}
