class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        Arrays.fill(res,-1);
        List<Integer> freq = new ArrayList<>(map.keySet());
        Collections.sort(freq);
        for(int i = 0;i < freq.size();i++){
            int a = freq.get(i);
            for(int j = i + 1;j < freq.size();j++){
                int b = freq.get(j);
                if(!map.get(a).equals(map.get(b))){
                    res[0] = a;
                    res[1] = b;
                    return res;
                }
            }
        }
        return res;
    }
}