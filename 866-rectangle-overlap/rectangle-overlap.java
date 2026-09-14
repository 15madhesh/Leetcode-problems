class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0] < rec2[0] ? rec2[0] : rec1[0];
        int y1 = rec1[1] < rec2[1] ? rec2[1] : rec1[1];

        int x2 = rec1[2] > rec2[2] ? rec2[2] : rec1[2];
        int y2 = rec1[3] > rec2[3] ? rec2[3] : rec1[3];
        return x1 < x2 && y1 < y2;
    }
}