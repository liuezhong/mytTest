import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2018/1/16.
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null) return sum == root.val;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
    public static void main(String[] args){
        HasPathSum a = new HasPathSum();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left =new TreeNode(6);
        t1.left.left.left = new TreeNode(7);
//        t1.right.right =new TreeNode(6);
//        t1.right.right.left = new TreeNode(7);
        System.out.print(a.hasPathSum(t1,3));
    }
}
