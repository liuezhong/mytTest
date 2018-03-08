/**
 * Created by Administrator on 2018/1/15.
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int total = n + m -1;
        while (i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[total--] = nums1[i--];
            }else {
                nums1[total--] = nums2[j--];
            }
        }
        while (j >= 0){
            nums1[total--] = nums2[j--];
        }

    }
    public static void main(String[] args){
        Merge a = new Merge();
        int[] nums1 = new int[6];
        nums1[0] = 6;
        nums1[1] = 9;
        a.merge(nums1,2,new int[]{1,5,9,12},4);
        System.out.print(nums1);
    }
}
