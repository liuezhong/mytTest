/**
 * Created by Administrator on 2018/1/15.
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
    public static void main(String[] args){
        IsSymmetric a = new IsSymmetric();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
//        TreeNode t1 = new TreeNode(1);
//        t1.left = new TreeNode(2);
//        TreeNode t2 = new TreeNode(1);
//        t2.right = new TreeNode(2);
        System.out.print(a.isSymmetric(t1));
    }
}


