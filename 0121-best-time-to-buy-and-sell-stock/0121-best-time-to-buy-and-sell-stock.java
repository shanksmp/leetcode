class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length <2){
            return 0;
        }

        int minPriceSoFar =  prices[0];
        int maxProfit = 0;

        for(int pointer = 1; pointer < prices.length ; pointer++){
            if(prices[pointer] < minPriceSoFar){
                minPriceSoFar = prices[pointer];
            }
            else{
                int currentProfit = prices[pointer] - minPriceSoFar;
                if(currentProfit > maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}