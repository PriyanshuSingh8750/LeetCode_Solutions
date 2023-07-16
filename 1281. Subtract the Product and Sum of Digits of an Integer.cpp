class Solution {
public:
    int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        while(n!=0){
            int c=n%10;
            s+=c;
            p*=c;
            n/=10;
        }
        return p-s;
    }
};
