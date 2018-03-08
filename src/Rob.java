/**
 * Created by Administrator on 2018/1/18.
 */
public class Rob {
    public int rob(int[] nums) {
        if(nums == null) return 0;
        if(nums.length == 1) return nums[0];
        int prevNo = 0;
        int prevYes = 0;
        for (int n : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
    public static void main(String[] args){
        Rob a = new Rob();
        System.out.print(a.rob(new int[]{20,30,7,9,60,8}));
    }
}
