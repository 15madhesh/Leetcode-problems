class Solution {
    public int countIntersectingIntervals(int[][] it) {
        int ct = 0;
        for(int i = 0;i < it.length;i++){
            int st1 = it[i][0];
            int ed1 = it[i][1];
            for(int j = i + 1;j < it.length;j++){
                int st2 = it[j][0];
                int ed2 = it[j][1];
                if(st1 <= ed2 && st2 <= ed1){
                ct++;
            }
            }
        }
        return ct;
    }
}