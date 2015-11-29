package pratyush;

public class careercup1 {
	public static void main(String main[]){
		String str="a1b2c3d1f9";
		System.out.println(str);
		String str1="";
		int i = 0;
		while(i<str.length()){
			char c=str.charAt(i+1);
			int ct= Character.getNumericValue(c);
			for(int j=0;j<ct;j++)
				str1+=str.charAt(i);
			i+=2;
		}
		System.out.println(str1);
	}
}
