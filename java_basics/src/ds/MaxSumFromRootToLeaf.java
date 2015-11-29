package ds;

public class MaxSumFromRootToLeaf {
	static int MaxSum(TreeNode t){
		if(t==null)
			return 0;
		if(t.left!=null && t.right==null){
			return t.getNum();
		}
		else if(t.left!=null && t.right==null)
			return t.getNum()+MaxSum(t.left);
		else if(t.left==null && t.right!=null)
			return t.getNum()+MaxSum(t.right);
		else{
			int s1=t.getNum()+MaxSum(t.left);
			int s2=t.getNum()+MaxSum(t.right);
			if(s1>s2)
				return s1;
			else
				return s2;
		}
	}
}
