//leet code problem 42: Trapping Rain Water
class Solution {
    public int trap(int[] height) {
        int n = height.length ; // length of the height array

        int[] leftMax = new int[n] ; // array to store the maximum height to the left of each index

        leftMax[0] = height[0] ; 

        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]) ; // fill left max array

        }

        int[] rightMax = new int[n] ; 

        rightMax[n-1] = height[n-1] ;
        for(int i = n -2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]) ; // fill right max array

        }

        int ans = 0 ;

        for(int i = 0 ; i < n ; i++){
            ans += Math.min(leftMax[i], rightMax[i]) - height[i] ; // calculate trapped water at each index
        }

        return ans ;


    }
}