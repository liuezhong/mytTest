import java.util.HashSet;

/**
 * Created by Administrator on 2018/1/18.
 */
public class IsHappy {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1){
            int result = 0;
            while (n != 0){
                result += Math.pow(n % 10, 2);
                n /= 10;
            }
            if(set.contains(result)){
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;
    }
    public static void main(String[] args){
        Rob a = new Rob();
        System.out.print(a.rob(new int[]{20,30,7,9,60,8}));
    }
}
