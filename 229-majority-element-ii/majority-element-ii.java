class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            hp.put(nums[i] , hp.getOrDefault(nums[i] , 0) + 1);
        }
        List<Integer> lt = new ArrayList<>();
        for(Map.Entry<Integer,Integer> map : hp.entrySet()){
            if(map.getValue() > nums.length / 3){
                lt.add(map.getKey());
            }
        }
        return lt;
    }
}