/**
 * Created by Administrator on 2018/1/17.
 */
public class ConvertToTitle {
    public String convertToTitle(int n) {
        if(n <= 0) return "";
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
    public static void main(String[] args){
        ConvertToTitle a = new ConvertToTitle();
        System.out.print(a.convertToTitle(1000));
    }
}
