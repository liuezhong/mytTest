/**
 * Created by Administrator on 2018/1/16.
 */
public class MaxProfitMany {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1){
            return 0;
        }
        int profit = 0;
        int temp = 0;
        int buyDayPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            temp = prices[i] - buyDayPrice;
            if(temp > 0){
                profit += temp;
                if(prices.length > i+1){
                    buyDayPrice = prices[i+1];
                }
            }else {
                buyDayPrice = prices[i];
            }
        }
        return profit > 0 ? profit : 0;
    }
    public static void main(String[] args){
        MaxProfitMany a = new MaxProfitMany();
        System.out.print(a.maxProfit(new int[]{4, 8, 1, 3, 2}));
    }
}
