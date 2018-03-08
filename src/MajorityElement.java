/**
 * Created by Administrator on 2018/1/17.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums == null){
            return 0;
        }
        int count = 0;
        int temp = 0;
        for(int num : nums){
            if(count == 0){
                temp = num;
            }
            count += (temp == num) ? 1 : -1;
        }
        return temp;
    }
    public static void main(String[] args){
        MajorityElement a = new MajorityElement();
        System.out.print(a.majorityElement(new int[]{1}));
    }
}
