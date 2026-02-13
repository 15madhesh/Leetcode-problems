class Solution {
    public int bs(int[] nums,int target,int flg){
        int l=0,r=nums.length-1,mid,i=0,ans = -1;
        while(l <= r){
            mid= l+((r -l)/2);
            if(nums[mid] == target){
                ans = mid;
                if(flg == 0) r = mid - 1;
                else l = mid + 1;
            } else if(nums[mid] < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = bs(nums,target,0);
        res[1] = bs(nums,target,1);
        return res;
    }
}