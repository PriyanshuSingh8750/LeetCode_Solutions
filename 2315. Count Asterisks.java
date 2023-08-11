class Solution {
    public int countAsterisks(String s) {
        int ans=0;
        int k=0; 
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='|') k++;
             if(k%2==0){
                    if(s.charAt(i)=='*') ans++;
                }
        }
        return ans;
    }
}
