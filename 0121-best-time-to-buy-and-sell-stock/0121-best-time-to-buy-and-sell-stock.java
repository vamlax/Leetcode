class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyprice=prices[0],sellprice=0,profit=0;
        int n = prices.length;
        int i;
        for(i=0;i<n-1;i++){
            sellprice=prices[i+1];
            if(buyprice<sellprice){
                profit=sellprice-buyprice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyprice=sellprice;
            }
        }
        if(maxProfit==0){
            return 0;
        }
        else{
            return maxProfit;
        }
    }
}