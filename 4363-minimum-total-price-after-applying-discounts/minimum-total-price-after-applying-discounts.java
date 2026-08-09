class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int d = discounts.length - 1;
        int  p = prices.length - 1;
        double tot = 0.00;
        while(p >= 0 && d >= 0){
            tot += prices[p] * (100 - discounts[d]) / 100.0;
            p--;
            d--;
        }
        while(p >= 0){
            tot += prices[p];
            p--;
        }
        return tot;
    }
}