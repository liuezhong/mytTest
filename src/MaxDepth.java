/**
 * Created by Administrator on 2018/1/15.
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int count = 1;
        return calculateDepth(root,count);
    }
    public int calculateDepth(TreeNode root,int count){
        if(root == null){
            return count;
        }
        if(root.left != null || root.right != null){
            count++;
        }
        return Math.max(calculateDepth(root.left,count),calculateDepth(root.right,count));
    }
    public static void main(String[] args){
        MaxDepth a = new MaxDepth();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left =new TreeNode(6);
        t1.left.left.left = new TreeNode(7);
        t1.right.right =new TreeNode(6);
        t1.right.right.left = new TreeNode(7);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
//        TreeNode t1 = new TreeNode(1);
//        t1.left = new TreeNode(2);
//        TreeNode t2 = new TreeNode(1);
//        t2.right = new TreeNode(2);
        System.out.print(a.maxDepth(t1));
    }
}
