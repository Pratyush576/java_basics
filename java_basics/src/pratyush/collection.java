package pratyush;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;


public class collection {
	public static void main(String []args){
		System.out.println("test");
		String str="passing";
		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("test1");
		namelist.add("test2");
		namelist.add("test3");
		namelist.add(str);
		System.out.println(namelist);
		System.out.println(namelist.get(2));
		System.out.println(namelist.size());
		ArrayList<String> al=new ArrayList<String>();

		System.out.println("<================Testing addAll() feature of Arraylist=============>\n");

		al.add("testing");
		al.addAll(namelist);
		System.out.println("new arraylist");
		System.out.println(al+"\nlength of ArrayList is "+al.size());
		System.out.println(al.get(2));


		System.out.println("<================Let me learn iterator now=============>\n");
		/*
		 * 
		 * iterator is mostly used to traverse the element of Arraylist
		 * 
		 */

		Iterator<String> itr =al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(al);
		al.add("test4");
		System.out.println(al);
		System.out.println();
		al.removeAll(namelist);
		System.out.println(al);






		TreeSet<String> al1=new TreeSet<String>();  
		al1.add("Ravi");  
		al1.add("Vijay");  
		al1.add("Ravi");  
		al1.add("Ajay");  

		Iterator<String> itr1=al1.iterator();  
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}  


	}
}
