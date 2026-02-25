class Solution {
    public int candy(int[] ratings) {
        int[] cd = new int[ratings.length];
        for(int i = 0;i < cd.length;i++){
            cd[i] = 1;
        }
        for(int i = 0;i < cd.length - 1;i++){
            if(ratings[i] < ratings[i+1]){
                cd[i+1] = cd[i] + 1;
            }
        }
        int cnt = 0;
        for(int i = cd.length - 1;i > 0;i--){
            if(ratings[i] < ratings[i-1]){
                if(cd[i-1] < cd[i] + 1){
                    cd[i-1] = cd[i]+1;
                }
            }
        }
        for(int i = 0;i < cd.length;i++){
            cnt += cd[i];
        }
        return cnt;
    }
}