package ds;

class Tree{
	public int i;
	public Tree left;
	public Tree right;
	Tree(int n){
		i=n;
		left=null;
		right=null;
	}
}

public class TreeDemo {
	static int sum=0;
	static Tree Add(Tree t,int num){
		if (t==null){
			return new Tree(num);
		}
		if(t.i>num){
			t.left=Add(t.left,num);
			return t; 
		}
		else{
			t.right=Add(t.right,num);
			return t;
		}
	}

	static void Inorder(Tree t){
		if(t==null){
			//System.out.print("null");
			return;
		}

		Inorder(t.left);
		System.out.print(t.i+"\t");
		Inorder(t.right);
	}

	static void mirror(Tree t){
		if(t==null)
			return;
		Tree temp;
		temp = t.left;
		t.left=t.right;
		t.right=temp;
		mirror(t.left);
		mirror(t.right);
	}
	static void update(Tree t){
		if(t==null){
			return;
		}
		else{
			update(t.right);
			sum+=t.i;
			t.i=sum;
			
			update(t.left);
		}
	}
	static void RoottoLeaf(Tree t, String str){
		//System.out.println("str:" +str);
		if(t==null){
			//System.out.println(str);
			return;
		}
		if(t.left==null&&t.right==null){
			str+=t.i+" ";
			System.out.println(str);
			return;
		}

		if(t.left==null && t.right!=null){
			str+=t.i+" ";
			RoottoLeaf(t.right, str);
		}
		else if(t.left!=null && t.right==null){
			str+=t.i+" ";
			RoottoLeaf(t.left, str);
		}
		else{
			str+=t.i+" ";
			RoottoLeaf(t.left, str);
			RoottoLeaf(t.right, str);
		}
	}

	public static void main(String args[]){
		Tree t=new Tree(5);
		Add(t,2);
		Add(t,6);
		Add(t,1);
		Add(t,23);
		Add(t,4);
		Add(t,3);
		Add(t,70);
		Add(t,31);
		Add(t,81);
		Add(t,9);
		Add(t,7);
		Add(t,91);
		Inorder(t);
		System.out.println();
		update(t);
		Inorder(t);

		System.out.println("\nMirror Tree:");

		mirror(t);
		Inorder(t);
		System.out.println();
		System.out.println("All Possible Root to Leaf Path's");
		RoottoLeaf(t, "");
		//System.out.println(t.i+" ");
	}
}
