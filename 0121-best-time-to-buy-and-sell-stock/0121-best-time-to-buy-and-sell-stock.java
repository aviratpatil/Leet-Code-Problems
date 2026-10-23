class Solution {
    public int maxProfit(int[] prices) {
        int buy_price=prices[0];

        // At begining the profit is zero
        int profit=0;
        for(int i=0; i<prices.length;i++){
            //if the current price is less then update the price
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
            else{
                int currentProfit=prices[i] - buy_price;
                profit=Math.max(currentProfit,profit);
            }
        }
        return profit;
    }
}