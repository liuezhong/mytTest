import java.util.ArrayList;

/**
 * Created by Administrator on 2018/1/8.
 */
public class quicksort {
    public int[] a = new int[]{4,5,34,7,8,34,56};
    int n;//定义全局变量，这两个变量需要在子函数中使用
    void quicksort(int left,int right)
    {
        int i,j,t,temp;
        if(left>right)
            return;
        temp=a[left]; //temp中存的就是基准数
        i=left;
        j=right;
        while(i!=j)
        {
//顺序很重要，要先从右往左找
            while(a[j]>=temp && i<j)
                j--;
//再从左往右找
            while(a[i]<=temp && i<j)
                i++;
//交换两个数在数组中的位置
            if(i<j)//当哨兵i和哨兵j没有相遇时
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
//最终将基准数归位
        a[left]=a[i];
        a[i]=temp;
        quicksort(left,i-1);//继续处理左边的，这里是一个递归的过程
        quicksort(i+1,right);//继续处理右边的，这里是一个递归的过程
    }
    int main()
    {
        int i;
        quicksort(1,n); //快速排序调用
//输出排序后的结果
        for(i=1;i<=n;i++)
            System.out.print(a[i]);
        return 0;
    }
}
