// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             int max = Integer.MIN_VALUE;
            // ArrayList<Integer>rr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                max=Math.max(max,curr.data);
                if(curr.left!=null){
                    q.add(curr.left);
                }if(curr.right!=null){
                    q.add(curr.right);
                }
               
            } ss.add(max);
        }
        return ss;
    }
}