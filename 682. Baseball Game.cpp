class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack <int> st;
        for(int i=0;i<operations.size();i++){
        
            if(operations[i]=="+"){
                int vr=st.top();
                st.pop();
                int sum=st.top()+vr;
                st.push(vr);
                st.push(sum);
            }
            else if(operations[i]=="C"){
                st.pop();
            }
            else if(operations[i]=="D"){
                 st.push(2*st.top());
            }
            else{
                int n=stoi(operations[i]);
                // int n=(int)operations[i];
                 st.push(n);
            }
        }
        int total = 0;
        while (!st.empty()) {
            total += st.top();
            st.pop();
        }
        return total;
    }
};
