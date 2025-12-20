class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //1. Frequency Analysis

        Map <Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) +1);
        }

        //2. Buckets creation

        List<Integer> [] buckets = new ArrayList[nums.length+1];
        for(int key : freq.keySet()){
            int f = freq.get(key);
            if(buckets[f] == null){
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(key);
        }

        //3. Top K Elements

        int idx = 0;
        int [] res = new int[k];
        for(int i = buckets.length - 1; i >= 0 && idx < k; i--){
                if(buckets[i] != null){
                    for (int num : buckets[i]){
                        res[idx++] = num;
                        if(idx == k)
                        break;
                    }
                }
        }
        return res;
    }
}