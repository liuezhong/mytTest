/**
 * Created by Administrator on 2018/1/15.
 */
public class MySqrt {
    public int mySqrt(int x) {
        long r = x;
        while (r * r > x){
            r = (r + x / r) / 2;
        }
        return (int)r;
    }
    public static void main(String[] args){
        MySqrt mySqrt = new MySqrt();
        System.out.print(mySqrt.mySqrt(2147395599));
    }
}
