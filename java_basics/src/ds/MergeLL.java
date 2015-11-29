package ds;

import java.util.LinkedList;

public class MergeLL {
	public static void main(String args[]){
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(5);
		ll.add(11);
		ll.add(21);
		ll.add(23);
		ll.add(45);
		System.out.println(ll);
		LinkedList ll1=new LinkedList();
		ll1.add(3);
		ll1.add(18);
		ll1.add(19);
		ll1.add(23);
		ll1.add(26);
		ll1.add(31);
		System.out.println(ll1);
		
		//ll.add(3, ll1.get(3));
		int i=0,j=0;
		while(i<ll.size()){
			while(j<ll1.size()){
				
			}
		}
		
		System.out.println(ll + " "+ ll.size());
		System.out.println(ll1+" "+ll1.size());
		
	}
}
