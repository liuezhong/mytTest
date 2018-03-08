/**
 * Created by Administrator on 2018/1/16.
 */
public class SortedArrayToBST {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if(nums == null || nums.length == 0){
//            return null;
//        }
//        if(nums.length == 1){
//            return new TreeNode(nums[0]);
//        }
//        TreeNode root = new TreeNode(nums[0]);
//        for(int i = 1; i < nums.length; i++){
//            root = insertIntoBST(root,nums[i]);
//        }
//        return root;
//    }
//    public TreeNode insertIntoBST(TreeNode root, int num){
//        if(root == null){
//            return new TreeNode(num);
//        }
//        if(num > root.val){
//            if(root.left == null && root.right != null){
//                if(num > root.right.val){
//                    root.left = new TreeNode(root.val);
//                    root.val = root.right.val;
//                    root.right = new TreeNode(num);
//                }else {
//                    root.left = new TreeNode(root.val);
//                    root.val = num;
//                    root.right = new TreeNode(root.right.val);
//                }
//            }else {
//                root.right = insertIntoBST(root.right,num);
//            }
//        }
//        else {
//            if(root.left == null && root.right != null){
//                if(num < root.left.val){
//                    root.right = new TreeNode(root.val);
//                    root.val = root.left.val;
//                    root.left = new TreeNode(num);
//
//                }else {
//                    root.right = new TreeNode(root.left.val);
//                    root.val = num;
//                    root.left = new TreeNode(root.val);
//                }
//            }else {
//                root.left = insertIntoBST(root.left,num);
//            }
//
//        }
//        return root;
//    }
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
    public static void main(String[] args){
        SortedArrayToBST a = new SortedArrayToBST();
        System.out.print(a.sortedArrayToBST(new int[]{0,1,2,3,4,5}).toString());
    }
}
