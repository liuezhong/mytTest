import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/18.
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        if(nums == null || k ==0) return;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){

            result[(i + k) % nums.length] = nums[i];
        }
        for(int j = 0; j < nums.length; j++){
            nums[j] = result[j];
        }
    }
    public static void main(String[] args){
        Rotate a = new Rotate();
        a.rotate(new int[]{-1},2);
    }
}
