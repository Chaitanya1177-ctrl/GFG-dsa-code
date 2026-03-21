/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        ArrayList<Integer>ss=new ArrayList<>();
         if (root == null) return ss;
        Queue<Node>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node curr=que.poll();
            while(curr!=null){
                ss.add(curr.data);
                if(curr.left!=null){
                    que.add(curr.left);
                }
                curr=curr.right;
            }
        }
        return ss;
    }
}