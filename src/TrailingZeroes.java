/**
 * Created by Administrator on 2018/1/17.
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        if(n <= 1) return 0;
        int count = 0;
        int temp = 1;
        for(int i = n; i > 1; i--){
            temp *= i;
        }
        while (temp % 10 == 0){
            count++;
            temp /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        TrailingZeroes a = new TrailingZeroes();
        System.out.print(a.trailingZeroes(7));
    }
}
