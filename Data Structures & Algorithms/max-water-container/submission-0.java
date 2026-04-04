class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int i=0;
        int j =n-1;
        int maxWater = Integer.MIN_VALUE;

        while(i<j){

            int water =  Math.min(height[i],height[j])*(j-i);
            maxWater = Math.max(maxWater,water);

            if(height[i]>height[j]){
                j--;
            }
            else {
                i++;
            }

        }

        return maxWater;
        
    }
}