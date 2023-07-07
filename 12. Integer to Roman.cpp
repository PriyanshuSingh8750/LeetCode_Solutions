class Solution {
public:
    string intToRoman(int num) {
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        string b[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        string ans="";
        for(int i=0;i<sizeof(arr)/sizeof(int);i++){
            while(num>=arr[i]){
                num-=arr[i];
                ans+=b[i];
            }
        }
        return ans;
    }
};
