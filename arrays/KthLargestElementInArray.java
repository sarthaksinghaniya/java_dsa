// leetcode problem 215: Kth Largest Element in an Array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>() ; //min heap

        for(int i = 0 ; i < nums.length ; i++){ 
            if(pq.size()<k){ // if the size of the heap is less than k
                pq.add(nums[i]) ; // add elements until size k

            }else if(pq.peek()<nums[i]){ // if the current element is larger than the smallest in the heap
                pq.remove() ; // remove the smallest
                pq.add(nums[i]) ; // add the larger element

            }
        }
        return pq.peek() ; // the kth largest element
    }
}