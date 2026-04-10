class Solution {
    public int find(int k,HashMap<Integer,Integer> map){
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            if(val.getValue() == k){
                return val.getKey();
            }
        }
        return 0;
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int num : nums) {
            hp.put(num, hp.getOrDefault(num, 0) + 1);
        }
        int n = hp.size();
        int[] arr = new int[k];
        int[] ct = new int[n];
        int i = 0;
        for (Map.Entry<Integer, Integer> val : hp.entrySet()) {
            ct[i++] = val.getValue();
            //System.out.println(val.getKey()+" "+val.getValue());
        }
        Arrays.sort(ct);
        for(i = 0;i < k;i++){
            arr[i] = find(ct[n - i - 1],hp);
            hp.remove(arr[i],ct[n-i-1]);
        }
        return arr;
    }
}