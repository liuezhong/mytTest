/**
 * Created by Administrator on 2018/1/8.
 */
public class Myquicksort {
    static int[] a = new int[]{34,67,45,8,9};
    static int n = a.length;
    void quicksort(int left,int right){
        int i,j,t,temp;
        if(left<right){
            return;
        }
        temp = a[left];
        i = left;
        j = right;
        while (i!=j){
            if(a[i] <= temp && i<j){
                i++;
            }
            if(a[j] >= temp && i<j){
                j--;
            }
            if(i<j){
                t = a[i];
                a[i] = a[j];
                a[j] = a[i];
            }
        }
        a[left] = a[i];
        a[i] = temp;
        quicksort(left,i-1);
        quicksort(i+1,right);
    }
    public static void main(String[] args)
    {
        Myquicksort myquicksort = new Myquicksort();
        int i;
        myquicksort.quicksort(1,n); //快速排序调用
//输出排序后的结果
        for(i=1;i<n;i++) {
            System.out.print(a[i]);
            System.out.print(',');
        }
    }
}
