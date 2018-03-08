/**
 * Created by Administrator on 2018/1/24.
 */
public class IsUgly {
    public boolean isUgly(int num) {
        for(int i = 2; i < 6 && num >0; i++){
            while (num % i == 0) {
                num /= i;
            }
        }
        return num == 1;
    }
    public static void main(String[] args){
        IsUgly a = new IsUgly();
        System.out.print(a.isUgly(18));
    }
}
