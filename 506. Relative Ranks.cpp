class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        unordered_map<int,int> mp;
        vector<int> temp=score;
        vector<string> s;
        sort(temp.begin(),temp.end(),greater<int>());
        for(int i=0;i<score.size();i++){
            mp[temp[i]]=i+1;
        }
        for(auto x:score){
            if(mp[x]==1){
                s.push_back("Gold Medal");
            }
            if(mp[x]==2){
                s.push_back("Silver Medal");
            }
            if(mp[x]==3){
                s.push_back("Bronze Medal");
            }
            if(mp[x]>3){
                s.push_back(to_string(mp[x]));
            }
        }
        return s;

    }
};
