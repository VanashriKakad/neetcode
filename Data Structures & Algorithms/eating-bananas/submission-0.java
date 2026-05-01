class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int max = piles[0];
        int right =max;
        int k = -1;

        for(int i=0;i<piles.length;i++){
            max= Math.max(max,piles[i]);
        }

        right = max;
        

        while(left<=right){
            int mid = left+(right-left)/2;

            if(isPossible(mid,piles,h)){
                k=mid;
                right=mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return k;
    }

    public boolean isPossible(int k, int[] piles,int h){

        int hours =0;
        for(int i=0;i<piles.length;i++){

            hours+= (piles[i]+k-1)/k;

            if(hours>h) return false;

        }

        return true;
    }
}