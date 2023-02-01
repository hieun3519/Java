public class buylowsellhigh {
    public static int maxProfit(int[] prices) {
        int l =0, r =1; // left is buy, right is sell
        int maxProfit =0; // keep track of the profit
        int profit =0;
        // itterate the whole prices array length
        while(r < prices.length){
            if (prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                l =r ;
            }
            r++;
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
