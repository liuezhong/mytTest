import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Administrator on 2018/1/15.
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        getLevel(resultList, root, 0);
        return resultList;
    }

    public void getLevel(List<List<Integer>> list, TreeNode root, int level){
        if(root == null){
            return;
        }
        if(level >= list.size()){
            list.add(0,new ArrayList<>());
        }
        getLevel(list, root.left, level + 1);
        getLevel(list, root.right, level +1);
        list.get(list.size()-level-1).add(root.val);
    }
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> wrapList = new ArrayList<>();
//
//        if(root == null) return wrapList;
//
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelNum = queue.size();
//            List<Integer> subList = new ArrayList<>();
//            for(int i=0; i<levelNum; i++) {
//                if(queue.peek().left != null) queue.offer(queue.peek().left);
//                if(queue.peek().right != null) queue.offer(queue.peek().right);
//                subList.add(queue.poll().val);
//            }
//            wrapList.add(0, subList);
//        }
//        return wrapList;
//    }
    public static void main(String[] args){
        LevelOrderBottom a = new LevelOrderBottom();
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
        System.out.print(a.levelOrderBottom(t1));
    }
}
