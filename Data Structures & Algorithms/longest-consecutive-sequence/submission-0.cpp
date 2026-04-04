class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int>st;
        for(auto x:nums)st.insert(x);
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            if(st.count(nums[i]-1))
            {
                continue;
            }
            int cn=0;
            int k=nums[i];
            while(st.count(k))
            {
                cn++;
                k++;
            }
            ans=max(ans,cn);
        }
        return ans;
    }
};
