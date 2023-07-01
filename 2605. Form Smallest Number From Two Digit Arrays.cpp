class Solution {
public:
    int minNumber(vector<int>& nums1, vector<int>& nums2) {
        int min1=*min_element(nums1.begin(), nums1.end());
        int min2=*min_element(nums2.begin(), nums2.end());
    //    sort(nums1.begin(),nums1.end());
    //    sort(nums2.begin(),nums2.end());
        map<int,int>mp;
        for(int i=0;i<nums1.size();i++){
            mp[nums1[i]]++;
        }
        for(int i=0;i<nums2.size();i++){
            mp[nums2[i]]++;
        }
        for(auto i:mp){
            if(i.second>=2){
                return i.first;
            }
        }
        int s=min(min1,min2);
        int ma=max(min1,min2);
        int ans=0;
        ans+=s;
        ans*=10;
        ans+=ma;
        return ans;

    }
};
