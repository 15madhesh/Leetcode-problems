class Solution {
    int val(int n){
        int v = 0;
        while(n > 0){
            v = (v * 10) + (n % 10);
            n /= 10;
        }
        return v;
    }
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = num / 2;i <= num;i++){
            if(i + val(i) == num){
                return true;
            }
        }
        return false;
    }
}