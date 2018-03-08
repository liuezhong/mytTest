/**
 * Created by Administrator on 2018/1/18.
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args){
        HammingWeight a = new HammingWeight();
        System.out.print(a.hammingWeight(11));
    }
}
