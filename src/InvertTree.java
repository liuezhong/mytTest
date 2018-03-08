/**
 * Created by Administrator on 2018/1/19.
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode result = new TreeNode(root.val);
        invertNode(root,result);
        return result;
    }
    public void invertNode(TreeNode root, TreeNode result){
        if(root.left != null){
            result.right = new TreeNode(root.left.val);
            invertNode(root.left,result.right);
        }
        if(root.right != null){
            result.left = new TreeNode(root.right.val);
            invertNode(root.right,result.left);
        }
    }
    public static void main(String[] args){
        InvertTree a = new InvertTree();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left =new TreeNode(6);
//        t1.left.left.left = new TreeNode(7);
        t1.right.right =new TreeNode(6);
//        t1.right.right.left = new TreeNode(7);
        System.out.print(a.invertTree(t1));
    }
}
