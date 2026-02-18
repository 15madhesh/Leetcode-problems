class Solution {
    public int[] sortByBits(int[] arr) {
        int[] count = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            int val = arr[i],ct = 0;
            while(val != 0){
                val = val & (val - 1);
                ct++;
            }
            count[i] = ct;
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if(count[i] > count[j] || (count[i] == count[j] && arr[i] > arr[j])){
                    int at = arr[i];
                    arr[i] = arr[j];
                    arr[j] = at;
                    int ct = count[i];
                    count[i] = count[j];
                    count[j] = ct;
                }
            }
        }
        return arr;
    }
}