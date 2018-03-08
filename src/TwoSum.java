/**
 * Created by Administrator on 2018/1/17.
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2 || numbers[0] > target){
            return null;
        }
        int low=0, high=numbers.length-1;
        while (numbers[low]+numbers[high]!=target){
            if (numbers[low]+numbers[high]<target){
                low++;
            } else {
                high--;
            }
        }
        return new int[]{low+1,high+1};
    }
    public static void main(String[] args){
        TwoSum a = new TwoSum();
        System.out.print(a.twoSum(new int[]{2, 7, 11, 15},13));
    }
}
