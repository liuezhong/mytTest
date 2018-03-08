/**
 * Created by Administrator on 2018/1/23.
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        while ((root.val - p.val) * (root.val - q.val) > 0)
            root = p.val < root.val ? root.left : root.right;
        return root;
    }
    public static void main(String[] args){
        LowestCommonAncestor a = new LowestCommonAncestor();
        TreeNode t1 = new TreeNode(6);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(8);
        t1.left.left =new TreeNode(0);
        t1.left.right = new TreeNode(4);
        t1.right.right =new TreeNode(6);
        t1.right.left = new TreeNode(7);
        t1.right.right = new TreeNode(9);
        System.out.print(a.lowestCommonAncestor(t1,new TreeNode(2),new TreeNode(4)));
    }
}
