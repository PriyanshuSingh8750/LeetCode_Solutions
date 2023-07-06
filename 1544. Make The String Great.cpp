class Solution {
public:
    string makeGood(string s) {
         for(int i = 0; i < s.size(); i++) {
            if(abs(s[i] - s[i+1]) == 32) {
                return makeGood(s.substr(0, i) + s.substr(i + 2));
            }
        }
        return s;    
    }
};
