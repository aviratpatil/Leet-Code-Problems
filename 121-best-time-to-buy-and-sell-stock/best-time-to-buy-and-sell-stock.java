class Solution {
    public int maxProfit(int[] prices) {
        int buying_price=prices[0]; // At start we select the buying price and in future if price goes down we will update the buying proice and then we will sell 
        int profit=0;
        // [7 1 5 3 6 4]
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buying_price){
                buying_price=prices[i]; // updated buying price 
                // in this the current price of share which pointer [i]showing is less then we will update buying price 
            }
            else{
                //calculating the profit by comparing current profit and and previous profit
                int currentProfit=prices[i]-buying_price;
                profit=Math.max(currentProfit,profit);
            }
        }
        return profit;
    }
}