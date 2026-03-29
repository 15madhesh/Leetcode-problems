class Solution {
    public int consecutiveNumbersSum(int n) {
        int rs = 0;
        for(int i = 1;(i + 1) * i <= 2 * n;i++){
            if(i % 2 == 1){
                if(n % i == 0){
                    rs++;
                }
            } else {  
                if((i / 2) == (n % i)){
                    rs++;
                }
            }
        }
        return rs;
    }
}