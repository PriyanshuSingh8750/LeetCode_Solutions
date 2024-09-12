class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> charSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            charSet.add(c); 
        }
        int ans=0;
        for (String str : words) {
            int count =0;
            for (char ch : str.toCharArray()) {
                if(charSet.contains(ch)){
                    count++;
                }
                if(count==str.length()){
                    ans++;
                }
            }      
        }
        return ans;
  }
}
