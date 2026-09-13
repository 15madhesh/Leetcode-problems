class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ct = 0;
        Set<Integer> hs = new HashSet<>();
        for(int n : nums){
            hs.add(n);
        }
        for(int n : hs){
            int[] arr = new int[3];
            int j = 0;
            for(int i = 0;i < nums.length;i++){
                if(n == nums[i]){
                    if(j < 3){
                        arr[j] = i;
                    }
                    j++;
                    //System.out.println(i);
                }
            }
            if(j == arr.length && (arr[1] - arr[0] == arr[2] - arr[1])){
                ct++;
            }
        }
        return ct;
    }
}