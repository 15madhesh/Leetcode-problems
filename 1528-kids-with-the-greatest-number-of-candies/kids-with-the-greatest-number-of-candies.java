class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = max < candies[i] ? candies[i] : max;
        }
        List<Boolean> lt = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                lt.add(true);
            } else {
                lt.add(false);
            }
        }
        return lt;
    }
}