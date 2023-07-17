class Solution {
public:
    int helper(int n){
        if(n==2){
            return 1;
        }
        else if(n%2!=0){
            return ((n-1)/2)+numberOfMatches(((n-1)/2)+1);
        }
        return (n/2)+helper(n/2);
    }
    int numberOfMatches(int n) {
       if(n==1){
           return 0;
       }
       return helper(n);    
    }
};
