class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] t = new int[m];
        for(int i = 0 ;i < m;i++){
            t[i] = nums1[i];
        }
        int i = 0,j = 0,k = 0;
        while(i < m && j < n){
            if(t[i] < nums2[j]){
                nums1[k] = t[i++];
            }else{
                nums1[k] = nums2[j++];
            }
            k++;
        }
        while(i < m){
            nums1[k++] = t[i++];
        }
        while(j < n){
            nums1[k++] = nums2[j++];
        }
    }
}