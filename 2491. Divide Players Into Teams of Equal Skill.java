class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        if(n%2!=0){
            return -1;
        }

        Arrays.sort(skill);
        long sum=skill[0]+skill[n-1];
        long ans=skill[0]*skill[n-1];
        for(int i=1,j=n-2;i<n/2 && j>=n/2;i++,j--){
            if(skill[i]+skill[j]!=sum){
                return -1;
            }
            else{
              ans+=(skill[i]*skill[j]);
            }
        }
        return ans;
    }
}
