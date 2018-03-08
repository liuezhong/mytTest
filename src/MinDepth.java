/**
 * Created by Administrator on 2018/1/16.
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null || root.right == null) {
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
    public static void main(String[] args){
        MinDepth a = new MinDepth();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
//        t1.right = new TreeNode(3);
//        t1.left.left =new TreeNode(6);
//        t1.left.left.left = new TreeNode(7);
//        t1.right.right =new TreeNode(6);
//        t1.right.right.left = new TreeNode(7);
        System.out.print(a.minDepth(null));
    }
}
