/**
 * Created by Administrator on 2018/1/16.
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1){
            return 0;
        }
        int profit = 0;
        int temp = 0;
        int buyDayPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            temp = prices[i] - buyDayPrice;
            if(temp > profit){
                profit = temp;
            }
            if(temp < 0 ){
                buyDayPrice = prices[i];
            }
        }
        return profit > 0 ? profit : 0;
    }
    public static void main(String[] args){
        MaxProfit a = new MaxProfit();
        System.out.print(a.maxProfit(new int[]{}));
    }
}
