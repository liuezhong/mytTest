/**
 * Created by Administrator on 2018/1/24.
 */
public class AddDigits {
    public int addDigits(int num) {
//        while (num / 10 != 0){
//            num = (num % 10 + num /10);
//        }
//        return num;
        if (num == 0) {
            return 0;
        }
        else{
            return (num - 1) % 9 + 1;
        }
    }
    public static void main(String[] args){
        AddDigits a = new AddDigits();
        System.out.print(a.addDigits(18));
    }
}
