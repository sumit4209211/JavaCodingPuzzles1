class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy=0, sell=0, max=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            buy=prices[i];   // assuming the current index value as buying value
            sell=prices[i+1];
            for(int j=i+2;j<n;j++){
                if(prices[j]>sell)sell=prices[j]; // finding max sell price
            }
            max=Math.max(max,sell-buy); // sell-buy will give us profit, we will save the max profit
        }
        return max;
    }
}