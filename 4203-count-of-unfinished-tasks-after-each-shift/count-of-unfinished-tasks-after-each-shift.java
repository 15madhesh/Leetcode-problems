class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        long[] pf = new long[tasks.length];
        pf[0] = tasks[0];
        for(int i = 1;i < tasks.length;i++) pf[i] = pf[i - 1] + tasks[i];
        long tot = pf[pf.length - 1];
        int[] res = new int[shifts.length];
        long work = 0;
        for(int i = 0;i < shifts.length;i++){
            work += shifts[i];
            if(work >= tot){
                res[i] = 0;
                work = 0;
            } else {
                int l = 0;
                int r = pf.length - 1;
                while(l <= r){
                    int m = l + (r - l) / 2;
                    if(pf[m] <= work) l = m + 1;
                    else r = m - 1;
                }
                res[i] = pf.length - l;
            }
        }
        return res;
    }
}