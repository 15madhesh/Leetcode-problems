class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> lt = new ArrayList<>();
        while(n > 0){
            lt.add(n % 10);
            n /= 10;
        }
        Collections.sort(lt);
        return (lt.get(lt.size() - 1) * lt.get(lt.size() - 2));
    }
}