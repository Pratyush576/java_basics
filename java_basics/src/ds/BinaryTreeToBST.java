package ds;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author pratyusk
 */
public class BinaryTreeToBST {
    public static List<Integer> list=new ArrayList<Integer>();
    static int index=-1;
    static void Inorder(TreeNode t) {
        if (t == null) {
            return;
        }
        Inorder(t.left);

        System.out.print(t.getNum() + "\t");
        list.add(t.getNum());
        Inorder(t.right);
    }

    static void realInorder(TreeNode t) {
        if (t == null) {
            return;
        }
        Inorder(t.left);
        System.out.print(t.getNum() + "\t");
        Inorder(t.right);
    }
    static void copyInorder(TreeNode t) {
        if (t == null) return;
        copyInorder(t.left);
        index++;
        t.setNum(list.get(index));
        copyInorder(t.right);
    }

    static void convertBT2BST(TreeNode t) {
        Inorder(t);
        Collections.sort(list);
        System.out.println();
        copyInorder(t);
        realInorder(t);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        final TreeNode rLeft = root.left;
        final TreeNode rRight = root.right;
        rLeft.left = new TreeNode(8);
        rLeft.right = new TreeNode(4);

        convertBT2BST(root);
    }
}
