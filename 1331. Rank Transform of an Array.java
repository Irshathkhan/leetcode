class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }
        return res; 
    }
}

        // int t = arr.length;
        // TreeSet<Integer> set = new TreeSet<>();
        // for(int i : arr){
        //     set.add(i);
        // }
        // List<Integer> list = new ArrayList<>(set);
        // int res[] = new int[t];
        // for(int i=0;i<list.size();i++){
        //     for(int j=0;j<t;j++){
        //         if(list.get(i)==arr[j]){
        //             res[j] = i+1;
        //         }
        //     }
        // }
        // return res;
