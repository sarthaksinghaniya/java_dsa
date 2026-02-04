//leetcode problem 179: Largest Number
import java.util.Arrays;
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length]; // convert int array to String array

        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[i] + "" ; // convert each integer to string

        }

        Arrays.sort(arr,(s1,s2) -> (s1+s2).compareTo(s2+s1)); // custom comparator to sort based on concatenated values

        StringBuilder sb = new StringBuilder("") ; // to build the final largest number string

        for(int i = arr.length-1 ; i>= 0 ; i--){
            sb.append(arr[i]) ;
        }

        if(sb.charAt(0) == '0'){
            return "0" ;

        }else{
            return sb.toString() ;
        }
    }
}