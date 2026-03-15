class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice = Integer.MAX_VALUE; // or prices[0];

        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            int profit = prices[i] - buyPrice;
            if(profit >  maxProfit ){
                 maxProfit = profit;
            }
        }
        return  maxProfit ;
        
    }
}