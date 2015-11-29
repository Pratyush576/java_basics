package pratyush;

import java.util.ArrayList;
import java.util.Collections;

public class largestnum_zammer {

	public static void main(String args[]){
		int num=988798236;
		System.out.println(num);
		ArrayList<Integer> str= new ArrayList<Integer>();
		while(num/10!=0){
			int flag=num%10;
			str.add(flag);
			num=num/10;
		}
		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);
		Collections.reverse(str);
		System.out.println(str);
		System.out.println(str.toString());
		
	}
}
