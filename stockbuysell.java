import java.util.*;

class stockbuysell{

    static int maxProfit(int[] price, int k, int n){
        // store result
        // profit[t][i]
        // maximum profit using atmost t transaction up to
        // day i
        int[][] profit = new int[k+1][n+1];

        // day 0, itterate that the profit is zero
        for(int i=0; i <=k; i++){
            profit[i][0] =0;
        }
        // popilate the array
        for(int i = 1; i <= k; i++){
            for(int j = 1; j < n; j++){
                int max_so_far =0;
                // finding the max amount of profit you can get
                // 
                for(int m=0; m < j; m++){
                    max_so_far = Math.max(max_so_far, price[j] - 
                    price[m] + profit[i-1][m]);
                }
                profit[i][j] = Math.max(profit[i][j-1], max_so_far);
            }
        }
        return profit[k][n-1];
    }
    public static void main(String[] args){

        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int k =2;
        int n = price.length;

        System.out.println("Maximum profit is: " + maxProfit(price, n, k));

    }
}