class Solution {
    public int findMin(int[] nums) {

        int left =0;
        int right =nums.length-1;
        int smallest = Integer.MAX_VALUE;

        while(left<= right){

            int mid = left +(right-left)/2;

            if(nums[left]<= nums[mid]){
                smallest = Math.min(nums[left],smallest);
                left = mid+1;
            }

            else if(nums[right]>=nums[mid]){
                smallest= Math.min(nums[mid],smallest);
                right = mid-1;
            }

        }

        return smallest;
        
    }
}
