import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resultList = new ArrayList<>();
        if(root == null) return resultList;
        String path = root.val+"";
        getTreePaths(resultList, path, root);
        return resultList;
    }
    public void getTreePaths(List<String> list, String path, TreeNode root){
        if(root.left == null && root.right == null){
            list.add(path);
        }
        if(root.left != null){
            getTreePaths(list, path + "->"+root.left.val, root.left);
        }
        if(root.right != null){
            getTreePaths(list, path + "->"+root.right.val, root.right);
        }
    }
    public static void main(String[] args){
        BinaryTreePaths a = new BinaryTreePaths();
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
        System.out.print(a.binaryTreePaths(t1));
    }
}
