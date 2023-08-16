class Solution {
    public int maxDepth(String s) {
        Stack <Character> st=new Stack<>();
        int var=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(i);
                var=Math.max(var,st.size());
            }
            else if(i==')'){
                st.pop();
            }
        }
        return var;
    }
}
