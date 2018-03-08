import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 1) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        ContainsDuplicate a = new ContainsDuplicate();
        System.out.print(a.containsDuplicate(new int[]{1,2,3,4}));
    }
}
