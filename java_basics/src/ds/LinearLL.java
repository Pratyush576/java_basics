package ds;



class node {
	public int i;
	public node nxt;
	node(){
		i=-1;
		nxt=null;
	}
}
public class LinearLL {
	static void Display(node nd){
		while(nd!=null){
			System.out.print(nd.i+"\t");
			nd=nd.nxt;
		}
	}

	static node reverse(node nd,node ptr){
		node temp;
		if(nd==null){
			return ptr;
		}
		else{
			temp=nd.nxt;
			nd.nxt=ptr;
			return reverse(temp,nd);

		}

	}

	static int palindrom(node n1, node n2){
		System.out.println("n1: ");
		Display(n1);
		System.out.println("\nn2: ");
		Display(n2);
		System.out.println();
		if(n1==null && n2==null){
			System.out.println("n1 and n2 both null");
			return 1;
		}
		else if(n1==null&&n2!=null){
			//System.out.println(n1.i+"-:-"+n2.i);
			System.out.println("n1==null&&n2!=null");
			return 0;
		}
		else if(n1!=null&&n2==null){
			System.out.println();
			System.out.println("n1!=null&&n2==null");
			return 0;
		}
		else{
			if(n1.i!=n2.i){
				
				System.out.println("n1 not equal to n2");
				return 0;
			}
			else{
				System.out.println(n1.i+":"+n2.i);
				//System.out.println(n1.nxt.i+":::"+n2.nxt.i);
				return palindrom(n1.nxt, n2.nxt);
			}
		}
	}

	public static void main(String []args){
		node ll;
		node flag;
		node temp=new node();
		temp.i=2;
		ll=temp;
		flag=ll;
		for(int i=1;i<20; i=i+2){
			node x=new node();
			x.i=i;
			flag.nxt=x;
			flag=flag.nxt;
			//Display(ll);
			//System.out.println();
		}
		
		
		node rev;
		Display(ll);
		System.out.println();
		System.out.println("Reversed LL");
		rev=reverse(ll,null);
		Display(rev);
		System.out.println();
		int stat=palindrom(ll, rev);
		if(stat==1){
			System.out.println("Palindrom LL");
		}
		else{
			System.out.println("Not Palindrom LL");
		}
		
		//=================================================================
		
		
		
		
		
		
	}

}
