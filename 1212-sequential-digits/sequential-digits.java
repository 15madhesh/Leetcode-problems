class Solution {
    public int length(int n){
        int ct = 0;
        while(n != 0){
            n /= 10;
            ct++;
        }
        return ct;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String s = "123456789";
        int l = length(low);
        int h = length(high);
        for(int i = l;i <= h;i++){
            for(int j = 0;j <= s.length() - i;j++){
                int n = Integer.parseInt(s.substring(j, i + j));
                if (n >= low && n <= high) {
                    res.add(n);
                }
            }
        }
        return res;
    }
}



