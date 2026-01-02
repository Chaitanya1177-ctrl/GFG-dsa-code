// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer>re=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            re.add(arr[i]);
        }
        for(int i=A;i<=B;i++){
            if(!re.contains(i)){
                return false;
            }
            
        }
        return true;
    }
}
