package ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode{
	TreeNode left;
	TreeNode right;
	private int num;
	public TreeNode(){
		left=null;
		right=null;
	}
	TreeNode(int n){
		left=null;
		right=null;
		num=n;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}


/*
 * 
 *     1
    /     \
   2       3
  /  \    / \
 4    5  6   7
Top view of the above binary tree is
4 2 1 3 7
Right view
1 3 7
Left View
1 2 4
levelorder traversal
1 2 3 4 5 6 7
spiral order traversal
1 2 3 7 6 5 4
Boundry Order
1 2 4 5 6 7 3

 * 
 * 
 */

public class TreeViews {
	static int levelMax=-1;
	public static void rightview(TreeNode t,int level){
		if(t==null){
			return ;
		}
		if(level>levelMax){
			System.out.print(t.getNum()+" ");
			levelMax=level;
		}
		rightview(t.right, level+1);
		rightview(t.left, level+1);
	}

	public static void leftview(TreeNode t,int level){
		if(t==null){
			return ;
		}
		if(level>levelMax){
			System.out.print(t.getNum()+" ");
			levelMax=level;
		}
		leftview(t.left, level+1);
		leftview(t.right, level+1);
	}


	public static void level_order(TreeNode t){
		Queue<TreeNode> s= new LinkedList<TreeNode>();
		TreeNode current=t;
		s.add(t);

		while(s.size()!=0){//current!=null){
			current=s.remove();
			if(current==null){
				return;
			}
			if(current.left != null){
				s.add(current.left);
			}
			if(current.right!=null){
				s.add(current.right);
			}
			//System.out.println(s.size());
			System.out.print(current.getNum()+" ");
		}
	}

	public static void NativePreorder(TreeNode t){
		//System.out.println();
		Stack<TreeNode> S=new Stack<TreeNode>();
		TreeNode t1=t;
		if(t==null){
			return;
		}
		if(t.left==null && t.right==null){
			System.out.print(t.getNum());
			return;
		}
		S.push(t1);
		while(S.size()>0){
			//System.out.println(S.size());
			//t1=S.peek();
			if(t1.left!=null){
				S.push(t1.left);
				t1=t1.left;
			}else{
				//System.out.println(S.size());
				t1=S.pop();
				//System.out.println("Pop element "+S.size());
				System.out.print(t1.getNum()+" ");
				if(t1.right!=null){
					t1=t1.right;
					S.push(t1);
				}

			}
		}
	}



	public static void Spiral_level_order(TreeNode t){
		Stack<TreeNode> s1= new Stack<TreeNode>();
		Stack<TreeNode> s2= new Stack<TreeNode>();
		TreeNode current=t;
		s1.push(t);
		while(s1.size()>0||s2.size()>0){
			while(s1.size()>0){
				current=s1.pop();
				System.out.print(current.getNum()+" ");
				if(current.right!=null){
					s2.push(current.right);
				}
				if(current.left!=null){
					s2.push(current.left);
				}
			}
			while(s2.size()>0){
				current=s2.pop();
				System.out.print(current.getNum()+" ");
				if(current.left!=null){
					s1.push(current.left);
				}
				if(current.right!=null){
					s1.push(current.right);
				}
			}
		}
	}
	static Stack<TreeNode> s=new Stack<TreeNode>();
	/*
	 * 1 2 4 5 6 7 3
	 */
	static void BoundryOrder(TreeNode t,int num){
		if(t==null)
			return;
		if(num==2){
			System.out.print(t.getNum()+" ");
			BoundryOrder(t.left, -1);
			BoundryOrder(t.right, 1);
		}
		else{
			if(num==-1){
				System.out.print(t.getNum()+" ");
				BoundryOrder(t.left, num);
				if(t.right!=null){
					BoundryOrder(t.right, 0);
				}
				return;
			}
			else if(num==1){
				s.push(t);
				BoundryOrder(t.right, num);
				if(t.left!=null){
					BoundryOrder(t.left, 0);

				}
				return;
			}
			else if(num==0){
				if(t.left==null && t.right==null){
					System.out.print(t.getNum()+" ");
					return;
				}
				else{
					BoundryOrder(t.left, num);
					BoundryOrder(t.right, num);
					return;
				}
			}
			else{

			}
		}
		while(s.size()>0){
			System.out.print(s.pop().getNum()+" ");
		}
	}


	static void DiagonalOrder(TreeNode t){
		Queue<TreeNode> s=new LinkedList<TreeNode>();
		s.add(t);
		while(s.size()>0){
			TreeNode temp=s.remove();
			while(temp!=null){
				if(temp.left!=null){
					s.add(temp.left);
				}
				System.out.print(temp.getNum()+" ");
				temp=temp.right;
			}
		}
	}


	static void Tre2LL(TreeNode T){
		if(T==null){
			return;
		}
		TreeNode root=T;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(T);
		TreeNode Prev=null;
		while(q.size()>0){
			TreeNode T1=q.remove();
			if(T1.left!=null)
				q.add(T1.left);
			if(T1.right!=null)
				q.add(T1.right);
			T1.left=Prev;
			T1.right=null;
			if(Prev!=null)
				Prev.right=T1;
			
			
			/*if(T1.left!=null&& T1.right!=null)
				System.out.print(T1.getNum()+"["+T1.left.getNum()+","+T1.right.getNum()+"] ");
			else if(T1.left!=null)
				System.out.print(T1.getNum()+"["+T1.left.getNum()+",null] ");
			else if(T1.right!=null)
				System.out.print(T1.getNum()+"[null,"+T1.left.getNum()+"] ");
			else
				System.out.print(T1.getNum()+"[null,null] ");*/
			Prev=T1;
		}
		TreeNode T1=root;
		//System.out.println(T1.getNum());
		//System.out.println(T1.left);
		while(T1!=null){
			if(T1.left!=null&& T1.right!=null)
				System.out.print(T1.getNum()+"["+T1.left.getNum()+","+T1.right.getNum()+"] ");
			else if(T1.left!=null)
				System.out.print(T1.getNum()+"["+T1.left.getNum()+",null] ");
			else if(T1.right!=null)
				System.out.print(T1.getNum()+"[null,"+T1.right.getNum()+"] ");
			else
				System.out.print(T1.getNum()+"[null,null] ");
			T1=T1.right;
		}
	}

	public static void main(String args[]){
		TreeNode tree=new TreeNode();
		TreeNode treel,treer;
		tree.setNum(1);
		tree.left=new TreeNode(2);
		tree.right=new TreeNode(3);
		treel=tree.left;
		treer=tree.right;
		treel.left=new TreeNode(4);
		treel.right=new TreeNode(5);
		treer.left=new TreeNode(6);
		treer.right=new TreeNode(7);
		System.out.println("Right View of the tree");
		levelMax=-1;
		rightview(tree, 0);
		System.out.println("\nLeft view of the tree");
		levelMax=-1;
		leftview(tree, 0);
		System.out.println("\nLevel-Order Traversal");
		level_order(tree);
		System.out.println("\nSpiral Level-Order Traversal");
		Spiral_level_order(tree);
		System.out.println("\nNative Inorder Traversal");
		NativePreorder(tree);
		System.out.println("\nMaximum Sum From Root to Leaf");

		System.out.println(MaxSumFromRootToLeaf.MaxSum(tree));
		System.out.println("Boundry Traversal");
		BoundryOrder(tree, 2);
		System.out.println("\nDiagonal Traversal");
		DiagonalOrder(tree);

		System.out.println("\nTree to LL");
		Tre2LL(tree);
		//System.out.println("\nVertical Order");
	}
}
