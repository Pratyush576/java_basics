package pratyush;
/*
 * write a function to reverse every alternate k nodes (where k is an input to the function) in an efficient way.
 * Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
 * Output:   3->2->1->4->5->6->9->8->7->NULL. 
 */
class ll{
	int num;
	ll nxt;
	ll(int n){
		num=n;
		nxt=null;
	}
	public void setNxt(ll nxt) {
		this.nxt = nxt;
	}
}
public class ReverseAlternateLL {
	static void PrintLL(ll List){
		if(List==null)
			return;
		System.out.print(List.num+" ");
		PrintLL(List.nxt);
	}
	static void Reverse(ll List,int n){
		if(List==null)
			return;

		ll flag=List,temp;

		temp=flag;
		for(int i=0;i<n-1;i++){
			flag=flag.nxt;
			if(flag==null){
				return;
			}
		}
		if(flag!=null){
			int no=temp.num;
			temp.num=flag.num;
			flag.num=no;
		}


		while(flag!=null){	
			for(int i=0;i<n-1;i++){
				if(flag.nxt!=null)
					flag=flag.nxt;
				else
					break;
			}
			if(flag.nxt==null){
				break;
			}
			temp=flag;
			for(int i=0;i<n-1;i++){
				//System.out.println("xxxxxxxx "+flag.num);
				if(flag.nxt != null)
					flag=flag.nxt;
				else{
					break;
				}
			}
			if(flag!=null){
				int no=temp.num;
				temp.num=flag.num;
				flag.num=no;
			}else{
				break;
			}
		}
	}
	public static void main(String[] args){
		ll root=new ll(10);
		ll temp=root;
		temp.nxt=new ll(23);
		temp=temp.nxt;
		temp.nxt=new ll(21);
		temp=temp.nxt;
		temp.nxt=new ll(22);
		temp=temp.nxt;
		temp.nxt=new ll(27);
		temp=temp.nxt;
		temp.nxt=new ll(33);
		temp=temp.nxt;
		temp.nxt=new ll(43);
		temp=temp.nxt;
		temp.nxt=new ll(29);
		temp=temp.nxt;
		temp.nxt=new ll(3);
		temp=temp.nxt;
		temp.nxt=new ll(73);
		temp=temp.nxt;
		temp.nxt=new ll(46);
		temp=temp.nxt;
		temp.nxt=new ll(16);
		temp=temp.nxt;
		temp.nxt=new ll(2);
		temp=temp.nxt;
		PrintLL(root);
		System.out.println();
		Reverse(root, 2);
		System.out.println();
		PrintLL(root);
	}
}
