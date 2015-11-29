package pratyush;

import java.util.ArrayList;

public class helloworld {
	public static String text1="Globle";
	public static void main(String []args){
		System.out.println(text1);
		System.out.println("Yes First Java program is ready....:) :)");
		String text1="Local";
		System.out.println(text1);
		System.out.println("==========================================");
		

		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("Pratyush");
		namelist.add("Praveen");
		namelist.add("Shakir");
		System.out.println(namelist);
	}

}
