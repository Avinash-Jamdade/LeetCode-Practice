class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        Set<Integer> taken = new HashSet<Integer>();
        
        for (int index = 0; index < nums.length; ++index) {
            if (taken.contains(nums[index])) {
                continue;
            }
            if (minHeap.size() == 3) {
                if (minHeap.peek() < nums[index]) {
                    taken.remove(minHeap.poll());
                    
                    minHeap.add(nums[index]);
                    taken.add(nums[index]);
                }
            } 
            else {
                minHeap.add(nums[index]);
                taken.add(nums[index]);
            }
        }
        
        if (minHeap.size() == 1) {
            return minHeap.peek();
        }
        else if (minHeap.size() == 2) {
            int firstNum = minHeap.poll();
            return Math.max(firstNum, minHeap.peek());
        }
        
        return minHeap.peek();
    }
}