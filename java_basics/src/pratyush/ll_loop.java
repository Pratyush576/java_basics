package pratyush;
class node{
	private int num;
	private node link;
	public node getnext(){
		return link;
	}
	public void setnext(node n){
		link=n;
	}
	
	public void insert(int num){
		this.num=num;
		//System.out.print(num);
		this.link=null;
		//return n;
	}
	public int getnum(){
		return num;
	}
}

public class ll_loop {
	public void detectloop(node N){
		node slowptr,fastptr;
		if(N==null){
			System.out.println("null list");
			return;
		}
		slowptr=N;
		fastptr=N;
		slowptr=slowptr.getnext();
		fastptr=fastptr.getnext().getnext();
		while(fastptr!=null){
			System.out.println(fastptr.getnum()+" "+slowptr.getnum());
			if(fastptr==slowptr){
				System.out.println("Loop Detected");
				break;
			}
			fastptr=fastptr.getnext().getnext();
			slowptr=slowptr.getnext();
		}
		if(fastptr==null){
			System.out.println("No loop found");
		}
	}

	public static void main(String[] args){
		node Node=new node();
		Node.insert(10);
		System.out.println(Node.getnum());
		node temp=Node;
		for(int i=1;i<20;i++){
			node n=new node();
			n.insert(i);
			temp.setnext(n);
			temp=temp.getnext();
		}
		temp.setnext(Node);
		temp=Node;
		
		ll_loop ll=new ll_loop();
		ll.detectloop(Node);
		
		/*
		while(temp.getnext()!=null){
			System.out.print(" "+temp.getnum()+" ");
			temp=temp.getnext();
		}
		*/
	}
}