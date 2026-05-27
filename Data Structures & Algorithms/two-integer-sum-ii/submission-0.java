class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left =0;
        int right = nums.length-1;

        while(left<right){

            int a = nums[left];
            int b = nums[right];
            int sum = a+b;

            if(sum == target){
                return new int[]{left+1,right+1};
            }
            
            else if(sum>target){
                right--;
            }

            else{
                left++;
            }
        }


        return new int[]{};
        
    }
}
