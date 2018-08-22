package collections;

import java.util.ArrayList;
import java.util.List;

public class listDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("124");
		list.add("125");
		list.add("126");
		List<String> list1 = new ArrayList<String>();
		list1.add("1233");
		list1.add("1243");
		list1.add("1253");
		list1.add("1263");
		System.out.println(list+" "+list1);
		list.addAll(list1);
		System.out.println(list);
		
	}
}
