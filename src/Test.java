/**
 * Created by Administrator on 2017/12/27.
 */
public class Test {
    public static void main(String[] args){
        System.out.println(new Test().test());
    }
    static int test(){
        int x = 1;
        try{
            return x;
        }
        finally {
            System.out.println("finally");
            ++x;
            return x;
        }
    }
}
