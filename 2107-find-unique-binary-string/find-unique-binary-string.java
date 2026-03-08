class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int[] val = new int[nums.length + 1];
        int j = 0;
        for(String word : nums){
            int i = 0;
            int num = 0;
            while(i < word.length()){
                num = num * 2 + (word.charAt(i++) - '0');
            }
            val[j] = num;
            j++;
        }
        val[j] = nums.length;
        Arrays.sort(val);
        for(int i = 0;i <= nums.length;i++){
            if(i >= nums.length || i != val[i]){
                int num = i;
                StringBuilder sb = new StringBuilder();
                if(num == 0) sb.append("0");
                while(num > 0){
                    sb.append(num % 2);
                    num /= 2;
                }
                sb.reverse();
                while(sb.length() < nums.length){
                    sb.insert(0,"0");
                }
                return sb.toString();
            }
        }
        return "";
    }
}