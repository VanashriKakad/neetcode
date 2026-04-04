class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> elements = new HashSet<>();

        int maxLength = 0;

        for(int num : nums){
            if(!elements.contains(num)){
                elements.add(num);
            }
        }

        for(int num : nums){
            

            if(elements.contains(num-1)){
                continue;
            }

            else{

            int count = 0;
            int n = num;
            while(elements.contains(n)){
                count++;
                n++;
            }

            maxLength = Math.max(maxLength,count);



            }


        }

        return maxLength;
        
    }
}
