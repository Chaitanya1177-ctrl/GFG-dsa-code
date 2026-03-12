import java.util.*;

class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){

            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }

            st.push(arr[i]);
        }

        return ans;
    }
}