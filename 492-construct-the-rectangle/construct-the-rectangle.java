class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int s = (int) Math.sqrt(area);
        int l = s,w = s;
        while(l != 0){
            if((l*w) == area){
                res[0] = w;
                res[1] = l;
                break;
            }else if((l*w) > area){
                l--;
            }else{
                w++;
            }
        }
        return res;
    }
}