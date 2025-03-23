class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
        // keys are nums[i] values are frequency of nums[i]
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //if b-a is negative then b has higher priority, if positive a has higher priority
        //adding to the hashmap based on values from hashmap (frequencies of nums[i])
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int key : map.keySet()){
            maxHeap.add(key);
        }
        //make array of len k to return
        int result[] = new int[k];
        //poll of the heap into return array
        for(int i = 0; i < k; i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
