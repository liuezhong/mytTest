/**
 * Created by Administrator on 2018/1/16.
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return dfsHeight(root) != -1;
    }

    public int dfsHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return Math.max(dfsHeight(root.left), dfsHeight(root.right)) + 1;
    }
    public static void main(String[] args){
        IsBalanced a = new IsBalanced();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left =new TreeNode(6);
        t1.left.left.left = new TreeNode(7);
        t1.right.right =new TreeNode(6);
        t1.right.right.left = new TreeNode(7);
        System.out.print(a.isBalanced(t1));
    }
}
