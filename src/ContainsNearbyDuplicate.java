import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 1) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        ContainsNearbyDuplicate a = new ContainsNearbyDuplicate();
        System.out.print(a.containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }
}
