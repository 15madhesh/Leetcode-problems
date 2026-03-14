class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int j = 0;
        for(int i = 0;i < n;i++){
            if(i % 7 == 0) j++;
            sum = sum + (i % 7) + j;
        }
        return sum;
    }
}