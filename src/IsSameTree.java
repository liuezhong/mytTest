/**
 * Created by Administrator on 2018/1/15.
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null)|| (p != null && q == null) || p.val != q.val){
            return false;
        }
        if(!isSameTree(p.left,q.left) || !isSameTree(p.right,q.right)){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        IsSameTree a = new IsSameTree();
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
        System.out.print(a.isSameTree(t1,t2));
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
