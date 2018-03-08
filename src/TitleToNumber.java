/**
 * Created by Administrator on 2018/1/17.
 */
public class TitleToNumber {
    public int titleToNumber(String s) {
        if (s == null) return 0;
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            num += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length()-i-1);
        }
        return num;
    }
    public static void main(String[] args){
        TitleToNumber a = new TitleToNumber();
        System.out.print(a.titleToNumber("AA"));
    }
}
