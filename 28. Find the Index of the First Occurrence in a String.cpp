class Solution {
public:
    int strStr(string haystack, string needle) {
       int n=needle.size();
       int m=haystack.size();
       for(int i=0;i<m;i++){
            if(n>m){
                return -1;
            }
            if(haystack.substr(i,needle.size())==needle){
                return i;
            }
            n++;
       }
       return -1;   
    }
};
