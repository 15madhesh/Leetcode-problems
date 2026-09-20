class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(Character ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int res = 0;
        int n = 0;
        int psh = 0;
        for(int i = freq.length - 1;i >= 0;i--){
            if(n % 8 == 0){
                psh++;
            }
            res += (psh * freq[i]);
            n++;
        }
        return res;
    }
}