package ds;
class Llist{
	private int num;
	Llist nxt;
	Llist() {
		nxt=null;
	}
	Llist(int n){
		nxt=null;
		num=n;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}



public class Palindromellcheck {
	public static void Print(Llist ll){
		Llist l1;
		l1=ll;
		while(l1!=null){
			System.out.print(l1.getNum()+" ");
			l1=l1.nxt;
		}
	}
	/*
	 * Check Palindrome without using any extra space
	 */
	public static void IsPalindrome(Llist ll){
		
	}
	
	
	public static void main(String[] args){
		Llist ll=new Llist();
		Llist temp=ll;
		temp.setNum(1);
		temp.nxt=new Llist(2);
		temp=temp.nxt;
		temp.nxt=new Llist(5);
		temp=temp.nxt;
		temp.nxt=new Llist(2);
		temp=temp.nxt;
		temp.nxt=new Llist(1);
		Print(ll);
	}
}
