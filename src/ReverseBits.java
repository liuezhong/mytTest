/**
 * Created by Administrator on 2018/1/18.
 */
public class ReverseBits {
//    public int reverseBits(int n) {
//        int count = 0;
//        int[] temp = new int[32];
//        long result = 0;
//        while (count < 32){
//            temp[count] = n % 2;
//            n /= 2;
//            count++;
//        }
//        for( int i = temp.length - 1; i >= 0; i--){
//            result += temp[i] * Math.pow(2,temp.length - 1 - i);
//        }
//        return  (int)result < 0 ? ((int)result)*(-1) : (int)result;
//    }
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }
    public static void main(String[] args){
        ReverseBits a = new ReverseBits();
        System.out.print(a.reverseBits(1));
    }
}
