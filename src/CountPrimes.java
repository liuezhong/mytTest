/**
 * Created by Administrator on 2018/1/19.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        CountPrimes a = new CountPrimes();
        System.out.print(a.countPrimes(3));
    }
}
