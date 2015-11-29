package pratyush;

public class split {
	public static void main(String args[]){
		String str="http://cdn.vizury.com/banners/images/common/arialArabicLib.swf https://ssl.vizury.com/analyze/commonLogger.php?banndt=&advid=536&templateid=40&bannerid=278422&zoneid=955&iid=55581765666bd3831049161NR&isLast=0";
		System.out.println(str);
		String[] str1=str.split(" ");
		System.out.println(str1[0]+"\n"+str1[1]);
	}
}
