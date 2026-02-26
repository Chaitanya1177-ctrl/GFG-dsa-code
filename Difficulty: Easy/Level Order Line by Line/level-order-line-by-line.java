class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        
        ArrayList<ArrayList<Integer>> ss = new ArrayList<>();
        
        if (root == null) {
            return ss;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            
            ArrayList<Integer> rr = new ArrayList<>();
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                
                Node curr = q.poll();
                rr.add(curr.data);
                
                if (curr.left != null) {
                    q.add(curr.left);
                }
                
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            
            ss.add(rr);   // ✅ Correct position (after full level)
        }
        
        return ss;
    }
}