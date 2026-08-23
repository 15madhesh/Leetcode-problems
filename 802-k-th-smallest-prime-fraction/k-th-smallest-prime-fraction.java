class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Double> tmp = new ArrayList<>();
        Map<Double, String> map = new TreeMap<>();
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                tmp.add((double) arr[i] / arr[j]);
                map.put((double)arr[i] / arr[j] , arr[i]+"/"+arr[j]);
            }
        }
        Collections.sort(tmp);
        String[] st = map.get(tmp.get(k - 1)).split("/");
        //System.out.print(map);
        int[] res = new int[2];
        res[0] = Integer.parseInt(st[0]);
        res[1] = Integer.parseInt(st[1]);
        return res;
    }
}