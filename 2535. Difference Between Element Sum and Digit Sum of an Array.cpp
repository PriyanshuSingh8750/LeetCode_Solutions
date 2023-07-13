class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int s1=accumulate(nums.begin(),nums.end(),0);
        int s2=0;
        for(auto i:nums){
             while (i != 0) {
                 s2 = s2 + i % 10;
                    i = i / 10;
                 }
        }
        return abs(s1-s2);
    }
};
