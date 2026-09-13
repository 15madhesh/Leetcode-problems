class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ct = 0;
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            hm.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(List<Integer> lt : hm.values()){
            if(lt.size() >= 3){
                int dis = lt.get(1) - lt.get(0);
                boolean var = false;
                for(int j = 1;j < lt.size();j++){
                    if(dis != lt.get(j) - lt.get(j - 1)){
                        var = true;
                        break;
                    }
                }
                if(!var) ct++;
            }
        }
        return ct;
    }
}