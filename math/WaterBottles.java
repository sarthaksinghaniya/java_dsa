class Solution {
    public int numWaterBottles(int numbottles, int numex) {
        int ans = numbottles ;

        while( numbottles>=numex ){
            int newb = numbottles / numex ;
            int remb = numbottles % numex ;

            ans = ans + newb ;
            numbottles = newb + remb ;

        }
        return ans ;

    }
}